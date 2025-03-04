//Faça um programa em kotlin que leia a largura e altura de uma parede, calcule e mostre a área a ser
//pintada e a quantidade de tinta necessária para o serviço, sabendo que cada litro de tinta pinta uma
//área de 2 metros quadrados. Sabendo que 1 litro = 2
import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`) // Scanner para leitura de entrada do usuário
    var largura_Parede:Float
    var altura_Parede:Float
    val area:Float
    val litro_Tinta:Float

    println("Nós facilitamos a vida para você fazendo o cálculo da Área de suas paredes!")
    println("\n Vamos lá, preciso da largura da sua parede: ")
    largura_Parede = scanner.nextFloat()
    println("Agora vou precisar da Altura: ")
    altura_Parede = scanner.nextFloat()
    area = largura_Parede * altura_Parede
    litro_Tinta = area / 2
    println("Essa é a área a ser pintada: $area")
    println("Essa é a quantidade de tinta: $litro_Tinta")

}