package extensions

import com.android.build.api.dsl.CommonExtension
import org.gradle.api.Project
import org.gradle.api.artifacts.VersionCatalogsExtension
import org.gradle.kotlin.dsl.dependencies
import org.gradle.kotlin.dsl.getByType

internal fun Project.configureAndroidCompose(
    commonExtension: CommonExtension<*, *, *, *, *, *>
) {
    commonExtension.apply {
        buildFeatures.compose = true

        composeOptions {
            //kotlinCompilerExtensionVersion = libs.findVersion("composeCompiler").get().requiredVersion
        }
    }

    dependencies {
        /*"api"(platform(libs.findLibrary("androidx-compose-bom").get()))
        "implementation"(libs.findBundle("compose").get())
        "debugImplementation"(libs.findBundle("compose.debug").get())*/
    }
}
