package Lists

fun <T> compress(list: List<T>): List<T> {
    return list.fold(mutableListOf()) { acc, t ->
        if (!acc.contains(t)) acc + t else acc
    }
}

operator fun <T> MutableList<T>.plus(elem: T): MutableList<T> {
    this.add(elem)
    return this
}