package Lists

fun <T> split(n: Int, list: List<T>): Pair<List<T>, List<T>> {
    return Pair(list.take(n), list.drop(n))
}