import com.android.build.gradle.LibraryExtension
import com.android.builder.model.Library
import com.ossipeeriver.convention.ExtensionType
import com.ossipeeriver.convention.configureBuildTypes
import com.ossipeeriver.convention.configureKotlinAndroid
import com.ossipeeriver.convention.configureKotlinJvm
import com.ossipeeriver.convention.libs
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.apply
import org.gradle.kotlin.dsl.configure
import org.gradle.kotlin.dsl.dependencies
import org.gradle.kotlin.dsl.kotlin

class JvmKtorLibraryConventionPlugin: Plugin<Project> {
    override fun apply(target: Project) {
        target.run {
            pluginManager.apply("org.jetbrains.kotlin.plugin.serialization")

            dependencies {
                "implementation"(libs.findBundle("ktor").get())
            }
        }
    }
}