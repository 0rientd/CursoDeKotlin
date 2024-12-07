fun main() {
    val number1 = "1" + "0"
    val number2 = 1 + 0

    println(number1)
    println(number2)

//  This code below raises an Exception. We can't convert string with characters. Strings only with numbers can be converted
//  val number3 = "10a"
//  val convertedNumber3 = number3.toInt()
//  println(convertedNumber3)

    // We can separate with "_" for long numbers
    val longNumber: Long = 1_234_567
    println(longNumber)

    // Operators
    val age = 28

    val addition = age + 10             // Is expected to have value 38
    val subtraction = age - 10          // Is expected to have value 18
    val multiplication = age * 10       // Is expected to have value 280
    val division = age / 10             // Is expected to have value 2 because it's an Integer

    println(addition)
    println(subtraction)
    println(multiplication)
    println(division)


    // Negative values
    val boolean = false
    println(!boolean)                   // Should print true
}