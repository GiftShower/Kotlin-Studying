package chap03.section3

fun main() {
    val result = callByName(otherLambda)
    println(result)
}

fun callByName(b: () -> Boolean): Boolean {
    println("callbyname function")
    return b()
}

val otherLambda: () -> Boolean = {
    println("otherlambda function")
    true
}