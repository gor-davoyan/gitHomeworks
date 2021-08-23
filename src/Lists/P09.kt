package Lists

fun <T> pack(list: List<T>): List<List<T>> {
    val result: MutableList<List<T>> = mutableListOf()
    var l = mutableListOf<T>()
    list.forEach {
        if (l.contains(it) || l.isEmpty()) l.add(it) else {
            result.add(l)
            l = mutableListOf(it)
        }
    }
    result.add(l)
    return result
}

fun <T> pack2(list: List<T>): List<List<T>> {
    return if (list.isEmpty()) emptyList() else {
        val l = list.takeWhile { it == list.first() }
        listOf(l) + pack(list.drop(l.size))
    }
}