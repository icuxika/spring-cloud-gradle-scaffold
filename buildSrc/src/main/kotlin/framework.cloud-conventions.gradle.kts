plugins {
    java
    org.springframework.boot
}

repositories {
    mavenCentral()
}

dependencies {
}

if (project.name != "gradle-kotlin-dsl-accessors") {
    // https://github.com/gradle/gradle/issues/15383
//    val libs = the<org.gradle.accessors.dm.LibrariesForLibs>()
//    println(libs.plugins.boot.get().pluginId)
//    println("${libs.plugins.boot.get().version}")

//    extensions.getByType<VersionCatalogsExtension>()

}