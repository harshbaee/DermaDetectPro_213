package com.example.derma;

import android.app.Activity;
import android.content.Intent;
import android.content.res.AssetFileDescriptor;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import org.tensorflow.lite.Interpreter;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;

public class DiseaseDetectionActivity extends AppCompatActivity {

    private static final int GALLERY_REQUEST_CODE = 1000;
    private ImageView imageView;
    private Bitmap selectedImage;
    private Interpreter lite;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_disease_detection);

        imageView = findViewById(R.id.imageView);
        Button pickImageButton = findViewById(R.id.pickImageButton);
        Button detectDiseaseButton = findViewById(R.id.detectDiseaseButton); // New button

        try {
            lite = new Interpreter(loadModelFile());
        } catch (IOException e) {
            e.printStackTrace();
            Toast.makeText(this, "Error loading model", Toast.LENGTH_SHORT).show();
        }

        pickImageButton.setOnClickListener(v -> openGallery());


        detectDiseaseButton.setOnClickListener(v -> analyzeImage());

        detectDiseaseButton.setOnClickListener(v -> {
            if (selectedImage != null) {
                analyzeImage(); // You can also call another method if needed
            } else {
                Toast.makeText(this, "Please select an image first", Toast.LENGTH_SHORT).show();
            }
        });
    }
    private void openGallery() {
        Intent intent = new Intent(Intent.ACTION_PICK);
        intent.setType("image/*");
        startActivityForResult(intent, GALLERY_REQUEST_CODE);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == GALLERY_REQUEST_CODE && resultCode == Activity.RESULT_OK && data != null) {
            Uri imageUri = data.getData();
            try {
                selectedImage = MediaStore.Images.Media.getBitmap(this.getContentResolver(), imageUri);
                imageView.setImageBitmap(selectedImage);
            } catch (IOException e) {
                e.printStackTrace();
                Toast.makeText(this, "Error loading image", Toast.LENGTH_SHORT).show();
            }
        }
    }

    private void analyzeImage() {
        if (selectedImage != null) {
            runModelInference(selectedImage);
        } else {
            Toast.makeText(this, "Please select an image", Toast.LENGTH_SHORT).show();
        }
    }

    private MappedByteBuffer loadModelFile() throws IOException {
        AssetFileDescriptor fileDescriptor = this.getAssets().openFd("model.tflite");
        FileInputStream inputStream = new FileInputStream(fileDescriptor.getFileDescriptor());
        FileChannel fileChannel = inputStream.getChannel();
        long startOffset = fileDescriptor.getStartOffset();
        long declaredLength = fileDescriptor.getDeclaredLength();
        return fileChannel.map(FileChannel.MapMode.READ_ONLY, startOffset, declaredLength);
    }

    private void runModelInference(Bitmap bitmap) {
        ByteBuffer inputBuffer = preprocessImage(bitmap);
        float[][] output = new float[1][8]; // Adjusted for model output
        lite.run(inputBuffer, output);
        showResult(output[0]); // Pass the first row for processing
    }

    private ByteBuffer preprocessImage(Bitmap bitmap) {
        Bitmap resizedBitmap = Bitmap.createScaledBitmap(bitmap, 224, 224, true);
        ByteBuffer inputBuffer = ByteBuffer.allocateDirect(4 * 224 * 224 * 3);
        inputBuffer.order(java.nio.ByteOrder.nativeOrder());

        int[] intValues = new int[224 * 224];
        resizedBitmap.getPixels(intValues, 0, resizedBitmap.getWidth(), 0, 0, resizedBitmap.getWidth(), resizedBitmap.getHeight());
        for (int pixelValue : intValues) {
            inputBuffer.putFloat(((pixelValue >> 16) & 0xFF) / 255.0f); // R
            inputBuffer.putFloat(((pixelValue >> 8) & 0xFF) / 255.0f);  // G
            inputBuffer.putFloat((pixelValue & 0xFF) / 255.0f);         // B
        }

        return inputBuffer;
    }
    private final String[] classNames = {
            "cellulitis",
            "impetigo",
            "athlete's foot",
            "nail fungus",
            "ringworm",
            "cutaneous larva migrains",
            "chicken pox",
            "shingles"
    };

    private void showResult(float[] output) {
        int predictedClassIndex = 0;
        float maxProbability = output[0];

        // Find the index of the highest value
        for (int i = 1; i < output.length; i++) {
            if (output[i] > maxProbability) {
                maxProbability = output[i];
                predictedClassIndex = i;
            }
        }

        String resultMessage = "Predicted Class: " + classNames[predictedClassIndex];
        Toast.makeText(this, resultMessage, Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (lite != null) {
            lite.close();
        }
    }
}

