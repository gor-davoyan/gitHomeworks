package Lists

fun <T> duplicateN(n: Int, list: List<T>): List<T> {
    return list.fold(mutableListOf()) { result, value ->
        result.addN(n, value)
    }
}