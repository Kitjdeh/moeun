plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    id("kotlin-kapt")
    id("dagger.hilt.android.plugin")
}

android {
    namespace = "kr.co.admin"
    compileSdk = Apps.COMPILE_SDK


    defaultConfig {
        applicationId = "kr.co.admin"
        minSdk = Apps.MINIMUM_SDK
        targetSdk = Apps.TARGET_SDK
        versionCode = Apps.VERSION_CODE
        versionName = Apps.VERSION_NAME

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
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
    kotlinOptions {
        jvmTarget = "17"
    }
    buildFeatures {
        viewBinding = true
        dataBinding = true
    }
}

dependencies {
    implementation("androidx.core:core-ktx:${DependencyVersions.KOTLIN}")
    implementation("androidx.appcompat:appcompat:${DependencyVersions.APP_COMPAT}")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")

    kapt("com.google.dagger:hilt-android-compiler:${DependencyVersions.HILT}")
    implementation("com.google.dagger:hilt-android:${DependencyVersions.HILT}")

    implementation(project(":presentation"))
    implementation(project(":domain"))
    implementation(project(":data"))
    implementation(project(":local"))
    implementation(project(":remote"))
}