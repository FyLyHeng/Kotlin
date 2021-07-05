package doc5.DivingInToKoilinFunAspects

val a = listOf("123","54","8","110")
val d = listOf("123","54","8","110")

fun main(args: Array<String>) {
    val b = a.flatMap { it.toList() }.distinct().sorted()

    println(b)
}