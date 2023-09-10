rootProject.name = "spring-cloud-gradle-scaffold"

include("framework-basic")
include("gateway")

for (project in rootProject.children) {
    if (project.name.startsWith("framework")) {
        project.projectDir = file("framework/${project.name}")
    }
}
include("user")
