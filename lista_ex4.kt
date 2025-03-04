//Crie um programa em Kotlin que leia o preço de um produto, calcule e mostre o seu PREÇO
//PROMOCIONAL, com 5% de desconto.

import java.util.Scanner
import kotlin.math.pow

fun main(){
    val scanner = Scanner(System.`in`)
    var produto: Float
    var desconto: Float
    var Novo_Valor: Float

    println("Insira o valor do produto: ")
    produto = scanner.nextFloat()
    desconto = (5 * produto) / 100
    Novo_Valor = produto - desconto

    println("O desconto é de: $Novo_Valor reais")
}


