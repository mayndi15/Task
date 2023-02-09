package basics

fun main() {

    println("soma = ${mathFunction(10, 20)}")
    println("soma = ${expressionBodyMathFunction(15, 10)}")
    println("soma = ${expressionBodyMathFunctionInference(10, 10)}")
    println("soma = ${functionDefault(10, 10)}")
    println("soma = ${functionDefault(10, 10, "hello")}")
    println("soma = ${functionDefault(message = "hello")}")
}

fun mathFunction(number1: Int, number2: Int) : Int {
    return number1 + number2
}

fun expressionBodyMathFunction(number1: Int, number2: Int) : Int = number1 + number2

fun expressionBodyMathFunctionInference(number1: Int, number2: Int) = number1 + number2

fun functionDefault(number1: Int = 5, number2: Int = 5, message: String = "oi") : Int {
    val result = number1 + number2
    println(message)
    return result
}

