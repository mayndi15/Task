package basics

fun main() {

    val inteiro = 199
    val aInt: Int = 7

    //int calculo = (inteiro < aInt) ? inteiro : aInt

    val calculo = if (inteiro < aInt) inteiro else aInt

    val temp = 25
    val arligado = if (temp >= 26){
        println("quente")
        true
    } else {
        println("frio")
        false
    }
    println("ligado: $arligado")
}