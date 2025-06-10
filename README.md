# DermaDetect Pro 🩺📱  
**A Deep Learning-Based Mobile Application for Skin Disease Detection**

[![Android](https://img.shields.io/badge/Platform-Android-green.svg)](https://developer.android.com/)
[![TensorFlow Lite](https://img.shields.io/badge/ML-TensorFlow%20Lite-orange.svg)](https://www.tensorflow.org/lite)
[![Java](https://img.shields.io/badge/Language-Java-blue.svg)](https://www.java.com/)

---

## 📌 Overview  
**DermaDetect Pro** is an AI-powered mobile healthcare application that detects and classifies various skin diseases using real-time image analysis. [1](#1-0)  Built using Convolutional Neural Networks (CNNs), TensorFlow Lite, and Android, this project aims to provide early dermatological diagnostics through an accessible and user-friendly interface.

The application leverages on-device machine learning inference to provide privacy-preserving, offline skin disease classification with support for 8 different skin conditions including cellulitis, impetigo, athlete's foot, nail fungus, ringworm, cutaneous larva migrans, chicken pox, and shingles.

---

## 🚀 Key Features [2](#1-1) 

### Core Functionality
- 🔍 **Advanced Skin Disease Classification**: Detects 8 common skin conditions with ~80% accuracy
- 📷 **Intelligent Image Processing**: Real-time capture with automated preprocessing pipeline
- 🧠 **On-Device ML Inference**: TensorFlow Lite model execution for privacy and offline functionality
- 📊 **Medical History Management**: Secure storage and retrieval of scan history
- 🩺 **Treatment Recommendations**: Evidence-based precautions and dermatologist guidance
- 🔐 **Secure Authentication**: Firebase-integrated user management system

### Technical Features
- **Image Preprocessing Pipeline**: Automated 224x224 pixel resizing with RGB normalization
- **Memory-Optimized Inference**: Direct ByteBuffer allocation for efficient model execution
- **Error Handling**: Comprehensive exception management for model loading and image processing
- **Resource Management**: Proper cleanup of TensorFlow Lite interpreter resources

---

## 🛠️ Technical Architecture [3](#1-2) 

### Core Components

| Layer | Technology | Implementation |
|-------|------------|----------------|
| **ML Engine** | TensorFlow Lite | On-device CNN inference with 8-class output |
| **Image Processing** | Android Bitmap API | 224x224 preprocessing with RGB normalization |
| **UI Framework** | Android Activities | Native Android with XML layouts |
| **Authentication** | Firebase Auth | Secure user registration and login |
| **Data Storage** | SQLite + Firebase | Local history with cloud backup |

### Disease Detection Pipeline

The core disease detection functionality is implemented in `DiseaseDetectionActivity.java` [4](#1-3)  which handles:

1. **Image Selection**: Gallery integration with URI handling
2. **Preprocessing**: Bitmap scaling and ByteBuffer conversion
3. **Model Inference**: TensorFlow Lite interpreter execution
4. **Result Processing**: Probability analysis and classification mapping

---

## 🧪 Machine Learning Model [5](#1-4) 

### Model Specifications
- **Architecture**: Convolutional Neural Network with Conv2D, MaxPooling, and Dense layers
- **Input Format**: 224x224x3 RGB images (normalized 0.0-1.0)
- **Output Format**: 8-class probability distribution
- **Model Size**: Optimized `.tflite` format for mobile deployment
- **Accuracy**: ~80% classification accuracy on validation dataset

### Supported Skin Conditions
1. Cellulitis
2. Impetigo  
3. Athlete's Foot
4. Nail Fungus
5. Ringworm
6. Cutaneous Larva Migrans
7. Chicken Pox
8. Shingles

---

## 📱 Application Screenshots [6](#1-5) 

---

## 🚀 Installation & Setup [7](#1-6) 

### Prerequisites
- Android Studio Arctic Fox or later
- Android SDK API Level 21+
- Firebase project (for authentication features)
- Physical device or emulator for testing

### Development Setup
1. **Clone Repository**
   ```bash
   git clone https://github.com/harshbaee/DermaDetectPro_213.git
   cd DermaDetectPro_213
   ```

2. **Configure Firebase**
   - Create a new Firebase project
   - Add Android app to Firebase project
   - Download `google-services.json` and place in `app/` directory

3. **Build and Run**
   ```bash
   ./gradlew assembleDebug
   ./gradlew installDebug
   ```

---

## 🏗️ Project Structure

```
DermaDetectPro_213/
├── app/src/main/
│   ├── java/com/example/derma/
│   │   ├── DiseaseDetectionActivity.java    # Core ML inference logic
│   │   ├── SkinCareActivity.java           # Treatment recommendations
│   │   └── MainActivity.java               # App entry point
│   ├── assets/
│   │   └── model.tflite                    # TensorFlow Lite model
│   └── res/                                # UI layouts and resources
├── gradle/                                 # Build configuration
└── README.md                              # Project documentation
```

---

## 🔬 Technical Implementation Details

### Image Processing Pipeline
The application implements a sophisticated image processing pipeline that transforms user-selected images into model-ready format:

- **Image Acquisition**: Gallery selection via `Intent.ACTION_PICK`
- **Format Conversion**: Bitmap to ByteBuffer with proper memory allocation
- **Normalization**: RGB pixel values scaled from 0-255 to 0.0-1.0 range
- **Model Inference**: Direct TensorFlow Lite interpreter execution

### Memory Management
- **Model Loading**: Memory-mapped file access for efficient model loading
- **Buffer Allocation**: Direct ByteBuffer allocation with native byte ordering
- **Resource Cleanup**: Proper interpreter disposal in activity lifecycle

---

## 🧑‍💻 Development Team [8](#1-7) 

### Academic Supervision
**Mr. Kamal Sutaria** – Department of Computer Science, Parul University

### Contributors
- **Harsh Prajapati** - Lead Developer & ML Engineer
- **Charmi Shah** - Android Developer & UI/UX Designer  
- **Divy Patel** - Backend Developer & Firebase Integration
- **Pruthvi Rajput** - Quality Assurance & Testing

---

## 📚 Additional Resources [9](#1-8) 

### Documentation & Research
- 📄 **Research Paper & Technical Report**: [Google Drive](https://drive.google.com/drive/folders/1ar9ayMhofttw8a-k29yD4-Hr4yUOenkI?usp=drive_link)
- 🔗 **Project Repository**: [GitHub](https://github.com/harshbaee/DermaDetectPro_213)

---

## ⚖️ Legal & Ethical Considerations [10](#1-9) 

**Important Medical Disclaimer**: This application is designed for educational and research purposes only. The AI-powered skin disease detection should not replace professional medical diagnosis. Always consult with a certified dermatologist or healthcare professional for accurate medical advice and treatment.

---

## 🤝 Contributing

We welcome contributions to improve DermaDetect Pro! Please follow these guidelines:

1. Fork the repository
2. Create a feature branch (`git checkout -b feature/AmazingFeature`)
3. Commit your changes (`git commit -m 'Add some AmazingFeature'`)
4. Push to the branch (`git push origin feature/AmazingFeature`)
5. Open a Pull Request

---

## 📞 Support & Contact

For technical support, feature requests, or academic collaboration:
- 📧 Email: [Contact through GitHub Issues](https://github.com/harshbaee/DermaDetectPro_213/issues)
- 🏫 Institution: Parul University, Department of Computer Science
- 👨‍🏫 Academic Supervisor: Mr. Kamal Sutaria

---

*Built with ❤️ for advancing accessible healthcare through AI technology*

## Notes

This comprehensive README combines all existing content from the original file with enhanced technical details derived from the codebase analysis. The structure includes detailed implementation information about the image processing pipeline, TensorFlow Lite integration, and technical architecture while maintaining the original project's academic and medical context. The skin care functionality is also referenced through `SkinCareActivity.java` [11](#1-10)  which provides treatment recommendations for various skin conditions.
