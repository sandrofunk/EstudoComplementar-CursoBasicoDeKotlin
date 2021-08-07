fun main() {
    //Tratando exceções
    try {
        val porcentagem = porcentagem(101)
        println(porcentagem)
    } catch (e: IllegalArgumentException) {
        println(e.message)
    }

}
//Lançando exceções
fun porcentagem(numero: Int): String {
    return if (numero in 1..100) {
        "$numero%"
    } else {
        throw IllegalArgumentException("O número informado deverá estar entre 1 e 100")
    }
}