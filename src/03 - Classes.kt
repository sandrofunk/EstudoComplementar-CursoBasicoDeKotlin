class Classes(
    val nome: String,
    val idade: Int
)

fun main() {
    val pessoa1: Classes = Classes(nome = "João", idade = 30)
    val pessoa2: Classes = Classes(nome = "Joaquim", idade = 20)

    println("Cliente 1: ${pessoa1.nome}")
    println("Cliente 2: ${pessoa2.nome}")

}