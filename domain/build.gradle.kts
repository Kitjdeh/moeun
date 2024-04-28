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

    kapt("com.google.dagger:hilt-android-compiler:${DependencyVersions.HILT}")
    implementation("com.google.dagger:hilt-core:${DependencyVersions.HILT}")

}