plugins {
    id 'com.android.application'
    id 'org.jetbrains.kotlin.android'
    id 'kotlin-kapt'
}

android {
    compileSdk 34
    defaultConfig {
        applicationId "com.deziau.investmenttracker"
        minSdk 24
        targetSdk 34
        versionCode 1
        versionName "1.0"
    }
    buildFeatures {
        compose true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.5.10"
    }
}

dependencies {
    implementation "androidx.core:core-ktx:1.13.1"
    implementation "androidx.activity:activity-compose:1.9.0"
    implementation "androidx.compose.ui:ui:1.6.7"
    implementation "androidx.compose.material3:material3:1.2.1"
    implementation "androidx.lifecycle:lifecycle-runtime-ktx:2.8.0"
    implementation "androidx.lifecycle:lifecycle-viewmodel-compose:2.8.0"
    implementation "androidx.room:room-runtime:2.6.2"
    kapt "androidx.room:room-compiler:2.6.2"
    implementation "androidx.room:room-ktx:2.6.2"
}
