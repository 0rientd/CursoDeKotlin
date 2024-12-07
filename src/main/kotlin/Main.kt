fun main() {
    // Every Kotlin file need to have a "main" function
    var text = "Olá Kotlin"
    text = "Meu nome é Carlos"
    println(text)

    // I can not change the piNumber. It's like a constant in another languages
    val piNumber = 3.14
    println(piNumber)

    // Size of the primitive types
    val byte: Byte = 8              // 8-bits
    val short: Short = 16           // 16-bits

    val integer: Int = 10           // 32-bits
    val double: Double = 10.23      // 64-bits
    val float: Float = 10.23F       // 32-bits
    val long: Long = 257            // 64-bits

    val stringExample: String = "Some example =P"

    val boolean: Boolean = true     // 8-bits (it can be false too)
    println(boolean)

    // Printing the types of the variables
    println(byte::class)
    println(short::class)
    println(long::class)
    println(boolean::class)

    // Conversion of types
    val someIntPrice: Int = 50

//  val convertedData: Double = someIntPrice.toDouble()
    val convertedData = someIntPrice.toDouble()

    println(someIntPrice::class)
    println(convertedData::class)

    println(convertedData)
}
