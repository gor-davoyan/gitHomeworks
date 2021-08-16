package Arithmetic

fun gcd(x: Int, y: Int): Int {
    if (x == 0) {
        return y
    }
    return gcd(y % x, x)
}