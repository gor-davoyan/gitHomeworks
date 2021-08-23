package Lists

fun <T> duplicate(list: List<T>): List<T> {
    return list.fold(mutableListOf()) { result, value ->
        result.addN(2, value)
    }
}

fun <T> MutableList<T>.addN(n: Int, value: T): MutableList<T> {
    repeat(n) { this.add(value) }
    return this
}
