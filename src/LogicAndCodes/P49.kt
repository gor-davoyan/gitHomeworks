package LogicAndCodes

fun grayCodes(bits: Int): List<String> {
    if (bits == 0) {
        return listOf("")
    }

    val codes = grayCodes(bits - 1)
    println(codes)
    val arr = ArrayList<String>()
    for (i in 0 until codes.size) {
        arr.add("0" + codes[i])
    }

    for (i in codes.size - 1 downTo 0) {
        arr.add("1" + codes[i])
    }
    return arr
}