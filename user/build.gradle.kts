plugins {
}

dependencies {
    implementation(libs.web)
    implementation(libs.bootstrap)
//    implementation(libs.sentinel)
    implementation(libs.commons.lang3)

    implementation(project(":framework-basic"))

    testImplementation(libs.test)
}
