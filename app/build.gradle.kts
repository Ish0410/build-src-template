import version.Androidx
import version.Test

plugins {
    id("imsh.android.application")
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}

android {
    // TODO: namespace 프로젝트에 맞게 변경 필요
    namespace = "com.example.build.sample"

    defaultConfig {
        // TODO: applicationId 프로젝트에 맞게 변경 필요
        applicationId = "com.example.build.sample"

        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
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
    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}

dependencies {
    implementation(Androidx.androidxCoreKtx)
    implementation(Androidx.androidxLifecycleRuntimeKtx)
    implementation(Androidx.androidxActivityCompose)
    implementation(platform(Androidx.androidxComposeBom))
    implementation(Androidx.androidxUi)
    implementation(Androidx.androidxUiGraphics)
    implementation(Androidx.androidxUiToolingPreview)
    implementation(Androidx.androidxMaterial3)

    testImplementation(Test.junit)
    androidTestImplementation(Test.androidxJunit)
    androidTestImplementation(Test.androidxEspressoCore)
    androidTestImplementation(Test.androidxUiTestJunit4)
    androidTestImplementation(platform(Androidx.androidxComposeBom))

    debugImplementation(Androidx.androidxUiTooling)
    debugImplementation(Androidx.androidxUiTestManifest)
}