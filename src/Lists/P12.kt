package Lists

fun <T> decode(list: List<Pair<Int, T>>) {
    list.fold(mutableListOf<T>()) { acc, pair ->
        repeat(pair.first) {
            acc.add(pair.second)
        }
        acc
    }
}