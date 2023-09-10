plugins {
    `kotlin-dsl`
}

repositories {
    mavenCentral()
}

dependencies {
    // https://github.com/gradle/gradle/issues/15383
    // 由于`val libs = the<org.gradle.accessors.dm.LibrariesForLibs>()`无法在`framework.cloud-conventions`使用，此依赖目前没用
    implementation(files(libs.javaClass.superclass.protectionDomain.codeSource.location))

    implementation(plugin(libs.plugins.boot))
}

fun plugin(provider: Provider<PluginDependency>) = with(provider.get()) {
    "$pluginId:$pluginId.gradle.plugin:$version"
}