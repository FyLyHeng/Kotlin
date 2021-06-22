package doc5.fundamental_03

fun main() {
    val x : Any = "11"
    if (x is String)
        println(x.length)

    if (x !is String)
        println("x not string")


    //assign x to a and convert to sting
//    val a = x as String // if x is not string will got error
    val b  = x as? String // if x is not string b is null
    val c = x as? String?:return // use in fun : if x is not string it will return break and c will null

    println("hi b $b")
    println("hi c $c")

    //if x is string will do block of code
    (x as String?).apply {
        println(this)
        println(this?.length)
    }




}