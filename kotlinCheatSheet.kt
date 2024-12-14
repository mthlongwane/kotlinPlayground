/**
 * reference: Kotlin in Action - Dmitry Jemerov and Svetlana Isakova
 * Example code: 
 * kotlinc kotlinCheatSheet.kt -include-runtime -d kotlinCheatSheet.jar
 * java -jar kotlinCheatSheet.jar
 *
 */

fun main(){
    namedGreeting()
}

fun namedGreeting(){
    println("What is your name ? ")
    val name =  readln()
    println("Hello $name!")

    println("How old are you ? ")
    val age: Int = readln().toInt()

    val person1 =  Person(name,age)
    println("Adult status ?: ${person1.isAdult}")

}
/**
 * Concise Kotlin Class
 * Note: Properties are a combination of class fields and their accessors(getters and setters)
 * @property name
 * @property age
 * @property isAdult computed value
 */
class Person( //Public class by Default
    val name: String, //val property is read only therefore it only gets the getter accessor
    val age: Int,
){
    val isAdult: Boolean
        get(){ // custom accessors allow you to override the default accessor logic.
            return age>18 //computed
        }
}