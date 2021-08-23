package Lists

fun <T> slice(from: Int, to: Int, list: List<T>): List<T> {
    return list.drop(from).take(to - from)
}