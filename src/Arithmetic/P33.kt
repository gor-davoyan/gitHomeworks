package Arithmetic

fun Int.isCoprimeTo(other: Int): Boolean {
    return gcd(this, other) == 1
}