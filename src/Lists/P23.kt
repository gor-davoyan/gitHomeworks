package Lists

import kotlin.random.Random

fun <T> randomSelect(n: Int, list: List<T>): List<T> {
    val newList = mutableListOf<T>()
    repeat(n) {
        val elem = list[Random.nextInt(list.size)]
        newList.add(elem)
    }
    return newList
}