// Faça um programa em Kotlin que leia quanto dinheiro uma pessoa tem na carteira (em R$) e mostre
// quantos dólares ela pode comprar. Considere US$1,00 = R$5,75.
import java.util.Scanner

fun main(){
    val scanner = Scanner(System.`in`) // Scanner para leitura de entrada do usuário
    var real:Float
    var dolar:Float



    println("Quantos reais possui meu querido?:")
    real = scanner.nextFloat()

    dolar = real * 5.75f
    println("Com $real reais, voce pode comprar $dolar dolares.")
    println("Deseja fazer outra conversao? (1 para sim, 2 para nao):")
    var opcao = scanner.nextInt()

    while (opcao == 1) {
        println("Quantos reais possui meu querido?:")
        real = scanner.nextFloat()

        dolar = real * 5.75f

        println("Com $real reais, voce pode comprar $dolar dolares.")

        println("Deseja fazer outra conversao? (1 para sim, 2 para nao):")
        opcao = scanner.nextInt()
        if (opcao == 2) {
            println("Finalizando programa")
            break

        }

    }
}



