// Top-level build file where you can add configuration options common to all sub-projects/modules.
buildscript {
    dependencies {
        classpath("com.google.dagger:hilt-android-gradle-plugin:${PluginVersions.HILT}")
    }
}

plugins {
    id("com.android.application") version "8.1.1" apply false
    id("org.jetbrains.kotlin.android") version PluginVersions.KOTLIN apply false
    id("com.android.library") version "8.1.1" apply false
    id("org.jetbrains.kotlin.jvm") version PluginVersions.KOTLIN apply false
    id("com.google.dagger.hilt.android") version PluginVersions.HILT apply false
}
