package Lists

fun <T> randomPermute(list: List<T>): List<T> {
    return randomSelect(list.size, list)
}