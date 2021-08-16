package Arithmetic

fun Int.primeFactors(): List<Int> {
    if (this.isPrime()) return listOf(this)
    var x = 0

    for (i in 2..this / 2) {
        if (i.isPrime() && this % i == 0) {
            x = i
            break
        }
    }

    return listOf(x) + (this / x).primeFactors()
}