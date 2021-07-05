package doc5.DivingInToKoilinFunAspects

//higher function is the fun that allow parameter is the function look like clusure in Grails
fun repeat(times:Int, fn:()-> Unit){
    (1..times).forEach {
        fn() //call function name function
    }
}


fun repeatIndex(times: Int, fn : (Int)-> Unit){
    (1..times).forEach {
        fn(it)
    }
}

fun main(args: Array<String>) {

    // java old style
    repeat(5,{
        println("Hello Kotlin")
    }
    )

    // kotlin new style more readable
    repeat(5){
        println("Hi kotlin")
    }
    //=================================

    repeatIndex(3) { i ->
        println("$i. Welcome Kotlin")
    }



    repeatIndex(3){
        println("$it. Welcome Kotlin")
    }
}