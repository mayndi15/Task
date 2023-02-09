package generics

fun main() {

    val maxInt = max(11, 12)
    val maxLong = max(123456L, 12345678L)
    val maxByte = max((-1).toByte(), (2).toByte())
    val maxString = max("A", "AB")

    println("The max Int = $maxInt")
    println("The max Long = $maxLong")
    println("The max Byte = $maxByte")
    println("The max String = $maxString")
}