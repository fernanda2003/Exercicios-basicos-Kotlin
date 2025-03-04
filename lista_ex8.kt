//Escreva um programa em kotlin para calcular a redução do tempo de vida de um
//fumante. Pergunte a quantidade de cigarros fumados por dias e quantos anos ele já fumou.
//Considere que um fumante perde 10 min de vida a cada cigarro. Calcule quantos dias de vida um
//fumante perderá e exiba o total em dias.

import java.util.Scanner

fun main(){
        val scanner = Scanner(System.`in`)
        val cigarros: Int
        val anos: Int
        val minutos_perdidos: Float
        val dias_perdidos: Int
        println("Quantos cigarros vocé fuma por dia?: ")
        cigarros = scanner.nextInt()
        println("Quantos anos vocé fuma?: ")
        anos = scanner.nextInt()

        minutos_perdidos = (cigarros * 10 * 365 * anos).toFloat()
        dias_perdidos = (minutos_perdidos / 1440).toInt()

        println("Vocé perdeu $dias_perdidos dias de vida.")



 }



