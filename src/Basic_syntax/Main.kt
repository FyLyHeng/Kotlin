package Basic_syntax

fun main(args: Array<String>){
//=========================================== test function ===================================================
    println("===== test with fun ====")
    outPutVoid(7,"jonh")
    output1("my name","liza")

    println("===== overloading fun ====")
    foo(10)                 // - call foo that have 1 param
    foo(2,10)        // - call foo that have 2 param


    // set new value to param that already have default
    // ex: qux = ...
    // that the same meaning
    foo(2,10)
    foo(bar = 10, baz = 20)


    // set value to bar, and qux, but baz is use default
    foo(1){println("hello")}

    //set new value to bar=1,baz=2, and qux = {...}
    foo(1,2) {
        val a:String = "Hi"
        println(a)
    }


    //pass value to qux without put name of param bcos bar, baz are have default so we can pass only qux like that
    //and bcos Unit is the last params of this fun

    foo(qux = {
        println("hello")
    })

    // lamda expression
    foo {
        println("hello")
    }



    //this is we freely order parameter
    println(reformat(normalizeCase = false,str = "Hi"))

    //params is array
    foo( str = *arrayOf("a","1","z"))


    println("\n  Variable number of arguments")
    val list = asList(1,2,3)
    println(list)

    // we can pass list in to parameter
    val lst = arrayOf(1,2,3)
    val result = asList(-1,0, lst,4)
    val result1 = asList(-1,0, *lst,4)  // *lst is mean get value of list. if not use * will return pointer of list

    println("result $result")
    println("result1 $result1")
//==============================================================================================



//uesing infex fun

    val a = 11
    a.sub(2) // assign here is not replace value 11 of a

    println("This is infix fun ${a}") //11
    println("This is infix fun ${a.sub(2)}") // here value 11 of a will replace by value from sub fun = 5
//==============================================================================================



// Generics

    event("a")
    event1<String>()
    event(String,"Hi niza")
}


