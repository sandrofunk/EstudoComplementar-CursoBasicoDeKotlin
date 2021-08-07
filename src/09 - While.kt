//Programa que calcula média das temperaturas

fun main() {
    var temperatura: Int = 0
    var somatorio: Int = 0
    var quantidade: Int = 0

    while (temperatura != 99) {
        println("Digite uma temperatura ou 99 para sair:")
        temperatura = readLine()!!.toInt()

        if (temperatura != 99) {
            somatorio += temperatura // incremento da variável somatório
            quantidade++ // incremento da variável quantidade
        }
    }

    println("A média das temperaturas é = ${somatorio/quantidade}")
}