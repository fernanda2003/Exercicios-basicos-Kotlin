//Desenvolva uma programa em kotlin que leia os valores de A, B e C de uma equação do segundo
//grau e mostre o valor de Delta. (formula Δ = b2 – 4ac)
import java.util.Scanner
import kotlin.math.pow

fun main(){
    val scanner = Scanner(System.`in`)
    var A:Float
    var B:Float
    var C:Float
    val Delta:Float

    println("Insira o valor de A: ")
    A = scanner.nextFloat()
    println("Insira o valor de B: ")
    B = scanner.nextFloat()
    println("Insira o valor de C: ")
    C = scanner.nextFloat()

    Delta = B.pow(2) - 4*A*C
    println("Toma essa lapada de resposta: $Delta")
}
