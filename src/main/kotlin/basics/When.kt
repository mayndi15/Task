package basics

fun main() {

    val pizzasOrder = 2

    when (pizzasOrder) {
        0 -> println("sem fome")
        1 -> println("com fome")
        2 -> println("muita fome")
        else -> {
            println("tem certeza?")
        }
    }

    when (pizzasOrder) {
        0 -> println("sem fome")
        1, 2 -> println("com fome")
        3 -> println("muita fome")
        else -> {
            println("tem certeza?")
        }
    }

    when (pizzasOrder) {
        Math.abs(pizzasOrder) -> println("mais de 1 pizza")
        else -> println("nao pediu nada")
    }

    when (pizzasOrder) {
        0 -> println("sem fome")
        in 1..4 -> println("com fome")
        in 5..9 -> println("muita fome")
        else -> {
            println("tem certeza?")
        }
    }

    when {
        pizzasOrder <= 0 -> println("nenhuma pizza")
        pizzasOrder % 2 == 1 -> println("numero de pizza impar")
        pizzasOrder % 2 == 0 -> println("numero de pizza par")

    }
}