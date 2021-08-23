package Lists

fun lotto(n: Int, k: Int): List<Int> {
    return randomSelect(n, (n..k).toList())
}