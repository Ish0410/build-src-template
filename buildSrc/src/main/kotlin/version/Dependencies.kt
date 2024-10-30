package version

object Androidx {
    const val androidxCoreKtx = "androidx.core:core-ktx:${Versions.coreKtx}"
    const val androidxLifecycleRuntimeKtx = "androidx.lifecycle:lifecycle-runtime-ktx:${Versions.lifecycleRuntimeKtx}"
    const val androidxActivityCompose = "androidx.activity:activity-compose:${Versions.activityCompose}"
    const val androidxComposeBom = "androidx.compose:compose-bom:${Versions.composeBom}"
    const val androidxUi = "androidx.compose.ui:ui"
    const val androidxUiGraphics = "androidx.compose.ui:ui-graphics"
    const val androidxUiTooling = "androidx.compose.ui:ui-tooling"
    const val androidxUiToolingPreview = "androidx.compose.ui:ui-tooling-preview"
    const val androidxMaterial3 = "androidx.compose.material3:material3"
    const val androidxUiFoundation = "androidx.compose.foundation:foundation"
    const val androidxLifecycleCompose = "androidx.lifecycle:lifecycle-runtime-compose:${Versions.androidxLifecycle}"
    const val androidxLifecycleRuntimeCompose = "androidx.lifecycle:lifecycle-runtime-compose:${Versions.androidxLifecycle}"
    const val androidxLifecycleViewModelCompose = "androidx.lifecycle:lifecycle-viewmodel-compose:${Versions.androidxLifecycle}"
    const val androidxNavigationCompose = "androidx.navigation:navigation-compose:${Versions.androidxNavigation}"
    const val androidxHiltNavigationCompose = "androidx.hilt:hilt-navigation-compose:${Versions.androidxHiltNavigationCompose}"
    const val androidxUiTestManifest = "androidx.compose.ui:ui-test-manifest"
}

object Kotlinx {
    const val kotlinxCoroutinesAndroid = "org.jetbrains.kotlinx:kotlinx-coroutines-android:${Versions.kotlinxCoroutines}"
    const val kotlinxCoroutinesGuava = "org.jetbrains.kotlinx:kotlinx-coroutines-guava:${Versions.kotlinxCoroutines}"
    const val kotlinxCoroutinesTest = "org.jetbrains.kotlinx:kotlinx-coroutines-test:${Versions.kotlinxCoroutines}"
    const val kotlinxSerializationJson = "org.jetbrains.kotlinx:kotlinx-serialization-json:${Versions.kotlinxSerializationJson}"
    const val kotlinStdlib = "org.jetbrains.kotlin:kotlin-stdlib-jdk8:${Versions.kotlin}"
    const val kotlinGradlePlugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.kotlin}"
}

object Google {
    const val kspGradlePlugin = "com.google.devtools.ksp:com.google.devtools.ksp.gradle.plugin:${Versions.ksp}"
}

object Tools {
    const val androidGradlePlugin = "com.android.tools.build:gradle:${Versions.agp}"
}

object Hilt {
    const val hiltAndroid = "com.google.dagger:hilt-android:${Versions.hilt}"
    const val hiltCompiler = "com.google.dagger:hilt-android-compiler:${Versions.hilt}"
    const val hiltCore = "com.google.dagger:hilt-core:${Versions.hilt}"
    const val hiltTesting = "com.google.dagger:hilt-android-testing:${Versions.hilt}"
    const val hiltTestingCompiler = "com.google.dagger:hilt-android-compiler:${Versions.hilt}"
}

object Retrofit {
    const val retrofitCore = "com.squareup.retrofit2:retrofit:${Versions.retrofit}"
    const val retrofitKotlinSerialization = "com.jakewharton.retrofit:retrofit2-kotlinx-serialization-converter:${Versions.retrofitKotlinxSerializationJson}"
    const val okhttpLogging = "com.squareup.okhttp3:logging-interceptor:${Versions.okhttp}"
}

object Link {
    const val lintApi = "com.android.tools.lint:lint-api:${Versions.lint}"
    const val lintChecks = "com.android.tools.lint:lint-checks:${Versions.lint}"
}

object Libraries {
    const val coilKt = "io.coil-kt:coil-compose:${Versions.coil}"
    const val coilKtCompose = "io.coil-kt:coil-compose:${Versions.coil}"
    const val coilKtSvg = "io.coil-kt:coil-svg:${Versions.coil}"
}

object Test {
    const val junit = "junit:junit:${Versions.junit}"
    const val androidxJunit = "androidx.test.ext:junit:${Versions.junitVersion}"
    const val androidxEspressoCore = "androidx.test.espresso:espresso-core:${Versions.espressoCore}"
    const val androidxUiTestJunit4 = "androidx.compose.ui:ui-test-junit4"
}

/*
object Plugin {
    const val androidApplication = "com.android.application", version.ref = "agp"
    const val jetbrains-kotlin-android = "org.jetbrains.kotlin.android", version.ref = "kotlin"
    const val google-ksp = "com.google.devtools.ksp", version.ref = "ksp" }
    const val google-hilt = "com.google.dagger.hilt.android", version.ref = "hilt"
}
*/
