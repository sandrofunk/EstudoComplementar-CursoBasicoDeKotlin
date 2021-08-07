fun main() {
    println(isLetter('i'))

    println(isNotDigit('a'))
}

fun isLetter(c: Char) = c in 'a'..'z' || c in 'A'..'Z'

fun isNotDigit(c: Char) = c !in '0'..'9'