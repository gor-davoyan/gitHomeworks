package Lists

fun <T> rotate(n: Int, list: List<T>): List<T> {
    return if (n > 0) {
        list.drop(n) + list.take(n)
    } else {
        list.takeLast(-n) + list.dropLast(-n)
    }
}