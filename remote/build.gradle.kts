plugins {
    id("java-library")
    id("org.jetbrains.kotlin.jvm")
    id("kotlin-kapt")
}

java {
    sourceCompatibility = JavaVersion.VERSION_17
    targetCompatibility = JavaVersion.VERSION_17
}

dependencies {

    implementation("org.jetbrains.kotlinx:kotlinx-serialization-json:1.3.3")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:${DependencyVersions.COROUTINE_CORE}")

    implementation("com.squareup.retrofit2:retrofit:${DependencyVersions.RETROFIT}")
    implementation("com.squareup.retrofit2:converter-gson:${DependencyVersions.RETROFIT}")
    implementation("com.squareup.retrofit2:converter-scalars:${DependencyVersions.RETROFIT}")

    kapt("com.google.dagger:hilt-android-compiler:${DependencyVersions.HILT}")
    implementation("com.google.dagger:hilt-core:${DependencyVersions.HILT}")
    implementation(project(":data"))


    //okHttp
    implementation("com.squareup.okhttp3:okhttp:${DependencyVersions.OKHTTP}")
    implementation("com.squareup.okhttp3:logging-interceptor:${DependencyVersions.LOGGING_INTERCEPTOR}")


    //Gson
    implementation("com.google.code.gson:gson:2.8.9")
}