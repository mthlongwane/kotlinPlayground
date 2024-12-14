// https://kotlinlang.org/docs/multiplatform-dsl-reference.html
plugins {
    kotlin("multiplatform") version "2.1.0"
}

repositories {
    mavenCentral()
}

kotlin {
    jvm{
        withJava() //This function is for projects that contain both Java and Kotlin source files. 
    }
    js().browser()
    macosX64("native") { // on macOS
    // linuxX64("native") // on Linux
    // mingwX64("native") // on Windows
        binaries {
            executable()
        }
    }
}

tasks.withType<Wrapper> {
    gradleVersion = "8.10"
    distributionType = Wrapper.DistributionType.BIN
}