package LogicAndCodes

fun Boolean.and_(vararg other: Boolean):Boolean {
    for (i in other) this.and_(i)
    return this
}

fun Boolean.xor_(vararg other: Boolean):Boolean {
    for (i in other) this.xor_(i)
    return this
}