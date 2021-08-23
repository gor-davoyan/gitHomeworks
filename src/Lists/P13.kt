package Lists

fun <T> encodeDirect(list: List<T>): List<Pair<Int, T>> {
    return list.fold(mutableListOf()) { result, value ->
        if (result.isEmpty()) mutableListOf(Pair(1, value)) else {
            val lastElement = result.last()
            if (value == lastElement.second) {
                result.remove(lastElement)
                result.add(Pair(lastElement.first + 1, value))
                result
            } else {
                result.add(Pair(1, value))
                result
            }
        }
    }
}