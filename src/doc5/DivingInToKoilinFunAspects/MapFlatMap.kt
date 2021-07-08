package doc5.DivingInToKoilinFunAspects

val a = listOf("123","54","8","110")

fun main(args: Array<String>) {
    val b = a.flatMap { it.toList() }.distinct().sorted().map { it.toInt() }.toTypedArray()
    println(b.javaClass)

    val c= listOf("boy","girl","man","woman")
    val d = c.reduce { acc, string -> acc + string }
    println(d)

    maxOf("aba","bab","aab").also { println(it) }
}