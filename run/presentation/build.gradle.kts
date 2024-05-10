plugins {
//    alias(libs.plugins.android.library)
//    alias(libs.plugins.jetbrainsKotlinAndroid)

    alias(libs.plugins.runique.android.feature.ui)
}

android {
    namespace = "com.ossipeeriver.run.presentation"

}

dependencies {
    implementation(libs.coil.compose)
    implementation(libs.google.maps.android.compose)
    implementation(libs.androidx.activity.compose)
    implementation(libs.timber)

    implementation(projects.core.domain)
    implementation(projects.run.domain)
}