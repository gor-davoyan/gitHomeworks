package Lists

fun flatten(list: List<Any>): List<Any> {
    return list.map {
        if (it is List<*>) flatten(it as List<Any>) else listOf(it)
    }.flatten()
}