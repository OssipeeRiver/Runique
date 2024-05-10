plugins {
//    alias(libs.plugins.android.library)
//    alias(libs.plugins.jetbrainsKotlinAndroid)

    alias(libs.plugins.runique.android.feature.ui)
}

android {
    namespace = "com.ossipeeriver.auth.presentation"
}

dependencies {
    implementation(projects.core.domain)
    implementation(projects.auth.domain)

//    implementation(libs.androidx.monitor)
//    implementation(libs.androidx.junit.ktx)
}