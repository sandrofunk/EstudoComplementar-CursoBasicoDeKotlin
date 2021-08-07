import java.io.BufferedReader
import java.io.File
import java.io.FileReader

fun main() {
    val idade = lerIdade()
    println(idade)
}

fun lerIdade(): Int? {
    val reader = FileReader(File("src/idades.txt"))
    val buffer = BufferedReader(reader)

    try {
        val numero = buffer.readLine()
        return Integer.parseInt(numero)
    } catch (e: NumberFormatException) {
        return null
    } finally {
        buffer.close()
    }
}