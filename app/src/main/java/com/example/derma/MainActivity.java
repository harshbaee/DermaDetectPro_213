package com.example.derma;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button diseaseDetectionButton = findViewById(R.id.btnDiseaseDetection);
        Button skinCareButton = findViewById(R.id.btnSkinCare);

        diseaseDetectionButton.setOnClickListener(v -> {
            startActivity(new Intent(MainActivity.this, DiseaseDetectionActivity.class));
        });

        skinCareButton.setOnClickListener(v -> {
            startActivity(new Intent(MainActivity.this, SkinCareActivity.class));
        });
    }
}
