version = libs.versions.project.version
group = libs.versions.project.group

repositories {
    mavenCentral()
}

val services = setOf("gateway", "user")

subprojects {
    if (this.name in services) {
        version = rootProject.version
        group = rootProject.group

        apply {
            plugin("framework.java-conventions")
            plugin("framework.cloud-conventions")
        }

        val implementation by configurations
        dependencies {
            implementation(platform(rootProject.project.libs.spring.boot.dependencies))
            implementation(platform(rootProject.project.libs.spring.cloud.dependencies))
            implementation(platform(rootProject.project.libs.spring.cloud.alibaba.dependencies))
        }
    }
}