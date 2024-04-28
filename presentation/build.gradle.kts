plugins {
    id("com.android.library")
    id("org.jetbrains.kotlin.android")
    id("kotlin-kapt")
    id("dagger.hilt.android.plugin")
}

android {
    namespace = "kr.co.presentation"
    compileSdk = Apps.COMPILE_SDK

    defaultConfig {
//        applicationId = "kr.co.presentation"
        minSdk = Apps.MINIMUM_SDK


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

    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-android:${DependencyVersions.COROUTINE_CORE}")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:${DependencyVersions.COROUTINE_CORE}")

    implementation("androidx.lifecycle:lifecycle-runtime-ktx:${DependencyVersions.LIFECYCLE}")
    implementation("androidx.lifecycle:lifecycle-viewmodel-ktx:${DependencyVersions.LIFECYCLE}")

    implementation("androidx.core:core-ktx:${DependencyVersions.KOTLIN}")
    implementation("androidx.appcompat:appcompat:${DependencyVersions.APP_COMPAT}")
    implementation("androidx.activity:activity-ktx:${DependencyVersions.ACTIVITY}")

    implementation("androidx.fragment:fragment-ktx:${DependencyVersions.FRAGMENT}")

    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    implementation("com.google.android.material:material:1.11.0")

    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")

    implementation("com.google.dagger:hilt-android:${DependencyVersions.HILT}")
    kapt("com.google.dagger:hilt-android-compiler:${DependencyVersions.HILT}")


    implementation(project(":domain"))
}