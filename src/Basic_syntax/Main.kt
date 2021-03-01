package Basic_syntax

fun main(args: Array<String>){

    println("===== tes with fun ====")
    outPut(7,"jonh")
    output1("my name","liza")

    println("===== overloading fun ====")
    foo(10)
    foo(2,10)



    // this util type can all by mulit way

    //1 look like clouser in grails
    foo(1){ println("hello") }

    //2
    foo(qux = { println("hello")})

    //3
    foo { println("hello")}



    //this is we freely order parameter
    println(reformat(normalizeCase = false,str = "Hi"))

    //params is array
    foo( str = *arrayOf("a","1","z"))


}


