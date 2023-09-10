plugins {
//    id("framework.java-conventions")
//    alias(libs.plugins.boot)
}

version = libs.versions.project.version.get()

dependencies {
    // bom
//    implementation(platform(libs.spring.boot.dependencies))
//    implementation(platform(libs.spring.cloud.dependencies))
//    implementation(platform(libs.spring.cloud.alibaba.dependencies))

    implementation(libs.web)
    implementation(libs.bootstrap)
//    implementation(libs.sentinel)
    implementation(libs.commons.lang3)

    implementation(project(":framework-basic"))

    testImplementation(libs.test)
}
