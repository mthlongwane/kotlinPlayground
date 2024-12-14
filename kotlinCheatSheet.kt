import Color.*
/**
 * reference: Kotlin in Action - Dmitry Jemerov and Svetlana Isakova
 * Example code: 
 * kotlinc kotlinCheatSheet.kt -include-runtime -d kotlinCheatSheet.jar
 * java -jar kotlinCheatSheet.jar
 *
 */

fun main(){
//    namedGreeting()
    playWithEnums()
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

//enum class Color{ // Standard Enum class with no constructor
//    RED, GREEN, BlUE,YELLOW, INDIGO, VIOLET
//}
fun playWithEnums(){
    println(Color.BLUE.rgb)     //Computed Enum Value
    Color.GREEN.printColour()   //Enum Function

    println(mixColours(Color.RED, Color.YELLOW))
    println(mixColours(Color.VIOLET, Color.YELLOW))
}

/**
 * An enum class representing common colors, each with its RGB (Red, Green, Blue) values.
 *
 * Each color is associated with red, green, and blue components, and an integer value
 * representing its combined RGB color code.
 *
 * @property r The red component of the color (0-255).
 * @property g The green component of the color (0-255).
 * @property b The blue component of the color (0-255).
 * @property rgb The calculated RGB color code as an integer.
 */
enum class Color(
   val r: Int,
   val g: Int,
   val b: Int
){
    RED(255, 0, 0), GREEN(0, 255, 0), BLUE(0, 0, 255), YELLOW(255, 255, 0), ORANGE(255, 165, 0), INDIGO(75, 0, 130), VIOLET(238, 130, 238);
    //Semicolon separates the enum constant list from the method definitions
    val rgb = (r * 256 + g) * 256 + b
    fun printColour() = println("$this is $rgb")
}


/**
 * Function for mixing two colours and returning a colour using a when statement
 *
 * @param color1
 * @param color2
 */
fun mixColours(color1:Color, color2:Color): Color{
    return when (setOf(color1,color2)){
        setOf(Color.RED, Color.YELLOW) -> Color.ORANGE //If the Enum is imported you dont need to use the Enum Name.
        setOf(BLUE, YELLOW) -> GREEN
        setOf(BLUE, VIOLET) -> INDIGO
        else -> throw Exception("Unkown colour mix")
    }
}