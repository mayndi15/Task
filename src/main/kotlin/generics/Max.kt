package generics

fun<T: Comparable<T>> max(param: T, param2: T): T {

    val result = param.compareTo(param2)
    return if (result > 0) param else param2
}