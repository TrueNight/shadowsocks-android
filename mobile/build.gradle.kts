plugins {
    id("com.android.application")
    id("com.google.android.gms.oss-licenses-plugin")
    kotlin("android")
    id("kotlin-parcelize")
}

setupApp()

android.defaultConfig.applicationId = "xyz.truenight.shadowsocks"

dependencies {
    val cameraxVersion = "1.0.1"

    implementation("androidx.browser:browser:1.3.0")
    implementation("androidx.camera:camera-camera2:$cameraxVersion")
    implementation("androidx.camera:camera-lifecycle:$cameraxVersion")
    implementation("androidx.camera:camera-view:1.0.0-alpha28")
    implementation("androidx.constraintlayout:constraintlayout:2.1.0")
    implementation("androidx.lifecycle:lifecycle-runtime-ktx:$lifecycleVersion")
    implementation("com.google.mlkit:barcode-scanning:17.0.0")
    implementation("com.google.zxing:core:3.4.1")
    implementation("com.takisoft.preferencex:preferencex-simplemenu:1.1.0")
    implementation("com.twofortyfouram:android-plugin-api-for-locale:1.0.4")
    implementation("me.zhanghai.android.fastscroll:library:1.1.7")
}
