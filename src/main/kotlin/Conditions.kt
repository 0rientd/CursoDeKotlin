fun main() {
    val product = "iPhone"

    if (product.length < 3) {
        println("You are not allowed to register products with small name")
    } else {
        println("The product was registered!")
    }

    val price = 25_321
    if (price >= 30_000) {
        println("You got 30% off! The price now is: ${price - price * 0.30}")
    } else if (price >= 20_000) {
        println("You got 30% off! The price now is: ${price - price * 0.20}")
    } else if (price >= 10_000) {
        println("You got 30% off! The price now is: ${price - price * 0.30}")
    } else {
        println("You don't get a bonus...")
    }

    if (product == "iPhone") println("You picked an iPhone") // Should print it
    if (product == "iPad") println("You picked an iPad") // Should not print it

    // In Kotlin, we can do conditionals without brackets
    if (!(product.isBlank()))
        println("Your product is not empty")
    else
        println("Your product is empty")

    // AND
    // TRUE  | TRUE  = TRUE
    // TRUE  | FALSE = FALSE
    // FALSE | TRUE  = FALSE
    // FALSE | FALSE = FALSE
    //
    // All conditionals needs to be true
    if (price == 25_321 && product == "iPhone") {
        println("All conditionals are true")
    } else {
        println("Some conditionals returned false")
    }

    // OR
    // TRUE  | TRUE  = TRUE
    // TRUE  | FALSE = TRUE
    // FALSE | TRUE  = TRUE
    // FALSE | FALSE = FALSE
    //
    // One conditional needs to be true
    if (price == 123_456 || product == "iPhone") {
        println("All or some conditional are true")
    } else {
        println("All conditionals are false")
    }

    // Comparing strings
    val product2 = "iMac"
    println(product == product2)
    println(product.equals("iPhone"))

    // Nullable
    //
    // In nullable context, we always need to check if the variable is null, with the "?" symbol
    val address: String? = null         // If we accept nulls in this variable, we need to put "?" in type
    var addressLength = address?.length
//  val addressLength = address.length // It raises an error
    println(addressLength)

    // Default value
//  addressLength = if (address != null) address.length else 0

    addressLength = address?.length ?: 0
    println(addressLength)
}