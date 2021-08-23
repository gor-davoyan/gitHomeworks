package Lists

fun <T> insertAt(elem: T, position: Int, list: List<T>): List<T> {
    return list.take(position) + listOf(elem) + list.drop(position)
}