# 🚀 Experimenting with Kotlin

Kotlin has many great features that I experiment with in this repository.
This repo will explore using Kotlin to create scripts, libraries and more. 

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
View available Gradle tasks:
```
gradle tasks

# or if your gradle build uses gradle wrapper:
./gradlew tasks

```
Common commands are:
run - Runs this project as a JVM application
build - Assembles and tests this project.

## How to use this project

All Files are self-contained and folders organise related files.

## Credits

https://kotlinlang.org/docs/command-line.html

https://docs.github.com/en/get-started/writing-on-github/getting-started-with-writing-and-formatting-on-github/basic-writing-and-formatting-syntax 
