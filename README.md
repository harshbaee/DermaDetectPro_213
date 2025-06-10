[![Ask DeepWiki](https://deepwiki.com/badge.svg)](https://deepwiki.com/harshbaee/DermaDetectPro_213)
# DermaDetect Pro 🩺📱  
A Deep Learning-Based Mobile Application for Skin Disease Detection  

## 📌 Overview  
**DermaDetect Pro** is an AI-powered mobile healthcare application that detects and classifies various skin diseases using real-time image analysis. Built using Convolutional Neural Networks (CNNs), TensorFlow Lite, and Android, this project aims to provide early dermatological diagnostics through an accessible and user-friendly interface.

---

## 🚀 Features
- 🔍 **Skin Disease Classification**: Detects common conditions such as acne, eczema, psoriasis, and melanoma.  
- 📷 **Real-time Image Capture**: Snap or upload an image from your phone.  
- 🧠 **On-Device Inference**: Runs the CNN model using TensorFlow Lite for fast, offline predictions.  
- 📊 **Medical History Tracking**: Stores and retrieves user scan history securely.  
- 🩺 **Treatment Suggestions**: Offers basic precautions and dermatologist guidance.  
- 🔐 **User Authentication**: Firebase-backed login and registration system.

---

## 🛠️ Tech Stack

| Category         | Tools / Frameworks                        |
|------------------|-------------------------------------------|
| **ML & AI**       | TensorFlow, Keras, CNN, TensorFlow Lite   |
| **Frontend**      | Android Studio, XML, Java/Kotlin          |
| **Backend/Storage** | Firebase Console, SQLite                  |
| **Image Handling** | OpenCV, PIL                               |
| **Other Tools**   | Git, GitHub, LabelImg (for annotation)    |

---

## 🧪 Model Training

- Custom-labeled dataset of skin disease images  
- Image augmentation techniques (flipping, zoom, contrast)  
- CNN with Conv2D, MaxPooling, and Dense layers  
- Achieved **~80% classification accuracy** on validation data  
- Converted to `.tflite` model for Android deployment

---

## 📷 Screenshots
- Home screen
![Screenshot (101)](https://github.com/user-attachments/assets/c780bc90-eb0a-4e11-9afa-15094720393f)
- Prediction result with diagnosis
![Screenshot (102)](https://github.com/user-attachments/assets/da258d25-15e3-410d-b0c8-fe3e83855846)
- Skin Care Routine
![Screenshot (106)](https://github.com/user-attachments/assets/b4fcea21-5366-4e65-a149-5b0175a2ccac)

---

## 📦 Installation & Usage

1. Clone this repository:  
   ```bash
   git clone https://github.com/harshbaee/DermaDetectPro_213.git
   ```

2. Open the Android project in Android Studio.

3. Replace the Firebase config files with your own (if testing login).

4. Build and run the app on an emulator or real device.

---

## 🤝 Project Guide  
**Mr. Kamal Sutaria** – Department of Computer Science, Parul University

---

## 🧑‍💻 Contributors  
- Harsh Prajapati
- Charmi Shah
- Divy Patel
- Pruthvi Rajput

---

## 📜 License  
This project is for educational purposes only. Always consult a certified dermatologist for medical advice.

---

## 🔗 Links  
- 🔗 Research Paper and Report [https://drive.google.com/drive/folders/1ar9ayMhofttw8a-k29yD4-Hr4yUOenkI?usp=drive_link]  
