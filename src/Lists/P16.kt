package Lists

fun <T> drop(n: Int, list: List<T>): List<T> {
    return list.filterIndexed { index, _ -> (index + 1) % n != 0 }
}