package Arithmetic

fun Int.totient(): Int {
    var counter = 0
    for (i in 1..this) {
        if (i.isCoprimeTo(this)) counter++
    }
    return counter
}