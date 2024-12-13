/*
 * This file was generated by the Gradle 'init' task.
 */

plugins {
    id("buildlogic.java-application-conventions")
    kotlin("jvm") version "2.1.0"
}

dependencies {
    implementation("org.apache.commons:commons-text")
    implementation(project(":utilities"))
    implementation(kotlin("stdlib"))
}

application {
    // Define the main class for the application.
    mainClass = "org.example.app.App"
}
repositories {
    mavenCentral()
}
kotlin {
    jvmToolchain(17)
}