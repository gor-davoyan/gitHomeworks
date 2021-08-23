package Lists

fun <T> encodeModified(list: List<T>): List<Any?> {
    return pack(list).map { if (it.size > 1) Pair(it.size, it[0]) else it[0] }
}