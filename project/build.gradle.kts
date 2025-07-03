// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    alias(libs.plugins.androidApplication) apply false
    alias(libs.plugins.jetbrainsKotlinAndroid) apply false
    id("com.google.devtools.ksp") version "2.0.0-1.0.21"
}

// build.gradle.kts (Project-level)
buildscript {
    val kotlinVersion = "2.0.0" // Use the latest stable version
    repositories {
        google()
        mavenCentral()
        //maven("https://jitpack.io")
    }
    dependencies {
        classpath("com.android.tools.build:gradle:7.4.0") // Use the latest version
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:$kotlinVersion")

    }
}

