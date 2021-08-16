package Arithmetic

fun Int.isPrime(): Boolean {
    var isPrimeNumber = true

    for (i in 2..this / 2) {
        if (this % i == 0) {
            isPrimeNumber = false
            break
        }
    }
    return isPrimeNumber
}