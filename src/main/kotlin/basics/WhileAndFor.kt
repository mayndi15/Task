package basics

fun main() {

    var x = 0;

    while (x < 10) {
        println("x = $x")
        x += 3
    }

    do {
        println("x = $x")
        x -= 3
    } while (x > 0)

    for (item in 1..10){
        print("$item, \n")
    }

    for (ch in "Mayndi"){
        println(ch)
    }

    println()
    var index = 0
    for (item in 10.rangeTo(20).step(2)){
        println("${++index}) $item, ")
    }

    println()
    for ((indx, item) in 10.rangeTo(20).step(2).withIndex()){
        println("${indx + 1}) $item, ")
    }


    val array = arrayOf(10, 20, 30)
    println()
    for (item in array.indices){
        println("index $item eh ${array[item]}")
    }


}