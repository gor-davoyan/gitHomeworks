package Arithmetic

fun Int.goldbach(): Pair<Int, Int> {
    val listPrimesInRange = listPrimesInRange(2..this)
    var t1 = 0
    var t2 = listPrimesInRange.size - 1

    while (t1 != t2) {
        val el1 = listPrimesInRange[t1]
        val el2 = listPrimesInRange[t2]
        if (el1 + el2 == this) {
            return Pair(el1, el2)
        } else if (el1 + el2 > this) {
            t2--
        } else if (el1 + el2 < this) {
            t1++
        }
    }
    return Pair(-1, -1)
}