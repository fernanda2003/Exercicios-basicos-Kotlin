//A locadora de carros precisa da sua ajuda para cobrar seus serviços. Escreva um programa em kotlin
//que pergunte a quantidade de Km percorridos por um carro alugado e a quantidade de dias pelos
//quais ele foi alugado. Calcule o preço total a pagar, sabendo que o carro custa R$ 90,00 por dia e R$
//0,20 por Km rodado.
import java.util.Scanner

fun main(){
    val scanner = Scanner(System.`in`)
    var KM: Float
    var total: Float
    var DIAS: Int

    println("Insira a quantidade de KM percorrido: ")
    KM = scanner.nextFloat()
    println("Insira a quantidade de dias do aluguel")
    DIAS = scanner.nextInt()

    KM = (0.20 * KM).toFloat()
    DIAS = DIAS * 90
    total = KM + DIAS


    println("Total do pagamento é: $total")
}