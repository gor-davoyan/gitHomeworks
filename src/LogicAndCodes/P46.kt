package LogicAndCodes

fun printTruthTable(block: (Boolean, Boolean) -> Boolean) {
    println("a\t\tb\t\tresult")
    val list = mutableListOf(
        Pair(true, true), Pair(true, false),
        Pair(false, true), Pair(false, false)
    )
    for (i in list) {
        println("${i.first}\t${i.second}\t${block(i.first, i.second)}")
    }
}

fun Boolean.not_() = !this
fun Boolean.and_(other: Boolean) = this && other
fun Boolean.or_(other: Boolean) = this || other
fun Boolean.nand_(other: Boolean) = this.and(other).not_()
fun Boolean.nor_(other: Boolean) = this.or_(other).not_()
fun Boolean.xor_(other: Boolean) = this.xor(other)
fun Boolean.equ_(other: Boolean) = this.xor_(other).not_()
fun Boolean.impl_(other: Boolean) = this.or_(other.not_())