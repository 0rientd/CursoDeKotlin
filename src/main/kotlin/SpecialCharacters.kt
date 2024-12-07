fun main() {
    val name = "Carlos"                         // A sequence of chars
    val firstLetter: Char = 'C'                 // 16-bits
    println(firstLetter)

//    val wrongTypeString: String = 'C'         // It raise an error

    val secondName = "Henrique"
    println(name + secondName)

    val specialChar = '\t'                      // make a
    println(name + specialChar + secondName)    // should print Carlos Henrique
}