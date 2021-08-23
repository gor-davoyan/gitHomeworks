package Lists

fun <T> removeAt(n: Int, list: List<T>): Pair<List<T>, T> {
    return Pair(list.filterIndexed { index, value -> index != n }, list[n])
}