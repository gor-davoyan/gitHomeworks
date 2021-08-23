package Lists

fun <T> encode(list: List<T>): List<Pair<Int, T>> {
    return pack(list).map { Pair(it.size, it[0]) }
}