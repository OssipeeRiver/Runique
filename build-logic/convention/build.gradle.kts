plugins {
    `kotlin-dsl`
}

group = "com.ossipeeriver.runique.buildlogic"

dependencies {
    compileOnly(libs.android.gradlePlugin)
}