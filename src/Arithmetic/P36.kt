package Arithmetic

import java.util.*
import kotlin.collections.ArrayList
import kotlin.collections.HashMap

fun Int.primeFactors2(): List<Pair<Int, Int>> {
    val primeFactors: MutableList<Int> = this.primeFactors().toMutableList()
    val map = HashMap<Int, ArrayList<Int>>()

    for (i in primeFactors) {
        if (map.contains(i)) {
            map[i]?.add(1)
        } else {
            map[i] = ArrayList(Arrays.asList(1))
        }
    }

    val l = mutableListOf<Pair<Int, Int>>()
    for (i in map) {
        l.add(Pair(i.key, i.value.size))
    }
    return l
}