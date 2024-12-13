
/*
 * Example code: 
 * kotlinc helloWorld.kt -include-runtime -d helloWorld.jar
 * java -jar helloWorld.jar
 *


/*
 * Compile a kotlin library .jar file that does not include the kotlin runtime
 *
 * @command:    kotlinc <fileName> -d <libaryName>.jar
 *
 * Example code:
 * kotlinc helloWorld.kt -d helloWorldLibrary.jar
 */

fun main(){
    println("Hello World from Kotlin!")
}