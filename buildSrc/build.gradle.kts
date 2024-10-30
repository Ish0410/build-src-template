plugins {
    `kotlin-dsl` // enable the Kotlin-DSL
}

repositories {
    google()
    mavenCentral()
}

dependencies {
    compileOnly("com.android.tools.build:gradle:8.4.1")
    compileOnly("org.jetbrains.kotlin:kotlin-gradle-plugin:1.9.20")
    compileOnly("com.google.devtools.ksp:com.google.devtools.ksp.gradle.plugin:1.9.10-1.0.13")
}

gradlePlugin {
    plugins {
        register("androidApplication") {
            id = "imsh.android.application"
            implementationClass = "plugins.AndroidApplicationConventionPlugin"
        }

        register("androidFeature") {
            id = "imsh.android.feature"
            implementationClass = "plugins.AndroidFeatureConventionPlugin"
        }

        register("androidLibrary") {
            id = "imsh.android.library"
            implementationClass = "plugins.AndroidLibraryConventionPlugin"
        }

        register("androidCompose") {
            id = "imsh.android.compose"
            implementationClass = "plugins.AndroidComposeConventionPlugin"
        }

        register("androidHilt") {
            id = "imsh.android.hilt"
            implementationClass = "plugins.AndroidHiltConventionPlugin"
        }
    }
}
