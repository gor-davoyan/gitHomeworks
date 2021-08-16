package Arithmetic

fun listPrimesInRange(intRange: IntRange): List<Int> {
    val list = mutableListOf<Int>()
    for (i in intRange) {
        if (i.isPrime()) list.add(i)
    }
    return list
}