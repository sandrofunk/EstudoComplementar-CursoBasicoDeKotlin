import java.lang.IllegalArgumentException

interface Expressao2
class Numero2(val valor: Int) : Expressao2
class Soma2(val esquerdo: Expressao2, val direito: Expressao2) : Expressao2

fun avaliacao2(expressao2: Expressao2): Int =
    when (expressao2) {
        is Numero2 -> {
            println("${expressao2.valor}")
            expressao2.valor
        }
        is Soma2 -> avaliacao2(expressao2.esquerdo) + avaliacao2(expressao2.direito)
        else -> throw IllegalArgumentException("Expressão é desconhecida")
    }

fun main() {
    // (( 1 + 2 ) + 4 )
    val resultado2 = avaliacao2(Soma2(Soma2(Numero2(1), Numero2(2)), Numero2(4)))
    println(resultado2)
}