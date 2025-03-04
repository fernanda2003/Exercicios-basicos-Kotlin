//Crie um programa kotlin que leia o número de dias trabalhados em um mês e mostre o salário de um
//funcionário, sabendo que ele trabalha 8 horas por dia e ganha R$25 por hora trabalhada.

import java.util.Scanner

fun main(){
    val scanner = Scanner(System.`in`)
    var DIAS: Int
    var salario: Float
    var salarioDia: Float

    println("Digite quantos dias trabalhou esse mês: ")
    DIAS = scanner.nextInt()

    salarioDia = (8 * 25).toFloat()
    salario = salarioDia * DIAS

    println("Esse é o salário desse mês: $salario")
}