package doc5.fundamental_04

val n1 = 1..10
val n2 = 1 until 11
val st = 'a'..'e'
val skip1 = n1 step 2
val isContaint5 = 5 in n1


fun main(args: Array<String>) {
    val range = listOf(n1,n2,st, skip1)

    range.forEach { printRange(it) } // grails style
    range.forEach(::printRange) // kotlin style
}

fun printRange(range: Iterable<Any>){
    range.joinToString("-").let { println(it) }
}