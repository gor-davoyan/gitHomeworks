package Arithmetic

fun printGoldbachList(intRange: IntRange, minPrime: Int = 0) {
    for (i in intRange) {
        val gb = i.goldbach()
        if (i % 2 == 0 && gb.first > minPrime && gb.second > minPrime) {
            println("$i = ${gb.first} + ${gb.second}")
        }
    }
}