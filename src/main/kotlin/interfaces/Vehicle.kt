package interfaces

interface Vehicle {

    val automakerName: String

    fun start() {
        println("Turn on car")
    }

    fun stop() {
        println("Brake noise")
    }

    fun getKmLiter(): Int {
        return 18
    }

    fun getDoors(): Int
}