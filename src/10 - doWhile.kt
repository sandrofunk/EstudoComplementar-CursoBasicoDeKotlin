//Programa que calcula média das temperaturas

fun main() {
    var temperatura: Int
    var somatorio: Int = 0
    var quantidade: Int = 0

    do {
        println("Digite uma temperatura ou 99 para sair:")
        temperatura = readLine()!!.toInt()

        if (temperatura != 99) {
            somatorio += temperatura // incremento da variável somatório
            quantidade++ // incremento da variável quantidade
        }
    }while (temperatura != 99)

    println("A média das temperaturas é = ${somatorio/quantidade}")
}