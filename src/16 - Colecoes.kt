fun main() {
    //ArrayList - Classe
    val frutas1 = ArrayList<String>()
    frutas1.add("Maça")
    frutas1.add("Banana")
    frutas1.add("Morango")
    println(frutas1)

    val frutas2 = arrayListOf("Maça", "Banana", "Morango")
    println(frutas2)

    println(HashSet::class.java)
    println(frutas1.last())
    println(frutas2.first())

    val numeros = setOf(1, 14, 2)
    println(numeros.maxOrNull())

}