# 🚀 Experimenting with Kotlin

Kotlin has a number of great features that I experiment with this repository.
This repo will explore using kotlin for creating scripts, libraries and more. 

## How to install and run the project

1. Install Kotlin Command Line Compiler - https://kotlinlang.org/docs/command-line.html#install-the-compiler

### Compile Kotlin .kt Applications using Kotlin Compiler:
```
kotlinc <filename>.kt -include-runtime -d <binaryFilename>.jar
```

To run the .jar file:
```
java -jar <filename>
```

### Compile Kotlin .kts Script using Kotlin Compiler:
```
kotlinc -script <filename>.kts -- <argumentOption> <argumentValue>
```

### Compile Kotlin/Java Project using Gradle:
The folder gradelKotlinCMD was initialised using the following gradle command:
```
gradle init --type java-application  --dsl kotlin
```
View available gradle tasks:
```
gradle tasks

# or if your gradle build uses gradle wrapper (this is recommended for reliable standardised execution )
#For Linux and MAC OS:
./gradlew tasks

#For Windows Powershell:
.\gradlew.bat build
```
Common commands are:
run - Runs this project as a JVM application
build - Assembles and tests this project.

## How to use this project

All Files are self contained and folders organise related files.

## Credits

https://kotlinlang.org/docs/command-line.html

https://docs.github.com/en/get-started/writing-on-github/getting-started-with-writing-and-formatting-on-github/basic-writing-and-formatting-syntax

https://docs.gradle.org/current/userguide/gradle_wrapper_basics.html#gradle_wrapper_basics