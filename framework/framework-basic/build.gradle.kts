plugins {
    id("framework.java-conventions")
    `java-library`
}

dependencies {
    // bom
    implementation(platform(libs.spring.boot.dependencies))
    implementation(platform(libs.spring.cloud.dependencies))
    implementation(platform(libs.spring.cloud.alibaba.dependencies))
    implementation(libs.web)
}