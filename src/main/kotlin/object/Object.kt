package `object`

fun main() {

    val location = object {
        var x = 200
        var y = 400
    }

    println("Coordinates = (${location.x}, ${location.y})")

    val location2 = object {
        var x = 300
        var y = 600

        fun printIt(){
            println("Coordinates = ($x, $y)")

        }
    }

    location2.printIt()

    location2.x = 3000
    location2.y = 6000
    location2.printIt()

    val temperature = MySingleton.getLastTemperature()
    println("Last temperature measured = $temperature degress")
}

object MySingleton{
    var temperatures = arrayOf(18, 22, 26)

    fun getLastTemperature() = temperatures.last()
}