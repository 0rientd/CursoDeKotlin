import java.time.format.DateTimeFormatter

fun main() {
    val name = "Carlos"             // String type
    val lengthName = name.length    // A property of String type

    println(lengthName)
    println("Carlos Henrique".length)

    println(name.uppercase())
    println(name.lowercase())


    val message = "\nHi, \n\nYour product was delivered!"
    println(message)

    val message2 = """
        Hi,
        
        Your product was delivered!
    """.trimIndent()                // This method puts the string to the left
    println(message2)

    val message3 = """
        Hi,
        
        Your product was delivered!
    """.replaceIndent(newIndent = ";")  // I can omit the "newIndent"
    println(message3)

    val birthYear: Int = 1996
    val yearNow = 2024

    println("Hi, $name. Your age is: ${yearNow - birthYear}. Nice to meet you!")
}