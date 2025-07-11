plugins {
    alias(libs.plugins.android.application)
}

android {
    namespace = "com.example.WeatherApp"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.example.WeatherApp"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
}

dependencies {

    implementation(libs.appcompat)
    implementation(libs.material)
    implementation(libs.activity)
    implementation(libs.constraintlayout)

    implementation(libs.lottie)

    implementation(libs.retrofit)
    implementation(libs.converter.gson)

    implementation (libs.sdp.android)
    implementation (libs.ssp.android)
    implementation (libs.lottie.v600)

    testImplementation(libs.junit)
    androidTestImplementation(libs.ext.junit)
    androidTestImplementation(libs.espresso.core)
}