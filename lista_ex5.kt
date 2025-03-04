//Faça um programa em kotlin que leia o salário de um funcionário, calcule e mostre o seu novo salário,
//com 15% de aumento.
import java.util.Scanner


fun main(){
    val scanner = Scanner(System.`in`)
    var salario: Float
    var aumento: Float
    var Novo_Valor: Float

    println("Insira o seu salário: ")
    salario = scanner.nextFloat()
    aumento = (15 * salario) / 100
    Novo_Valor = salario + aumento

    println("Parabés CLT, seu salário agora é de: $Novo_Valor")
}
