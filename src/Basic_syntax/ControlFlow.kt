package Basic_syntax

fun main(args: Array<String>) {

//==================================
    //if
    var max = 1
    if (1 < 2) max = 1

    //if else
    var min: Int
    if (2 < 1) {
        min = 1
    } else {
        min = 2
    }

    //expression
    // arg will get value from true or false

    val arg = if (1>2) 1 else 2



    //assing value with do operation
    val a = if (1>2){
        println("a is 1")
        1
    }else{
        println("a is 2")
        2
    }

//==================================
    //when check

    val x:Int=10
    when(x){
        1-> println("x is 1")
        2-> {
            println("x is 2")
        }
        3,4->{
            println("x is 3 or 4")
        }

        in intArrayOf(5,6,7,8)->{
            println("x is in 5 to 8")
        }

        !in 9..15->{
            println("x is not in 9 to 15")
        }

        else->{
            println("default")
            println("x is not [1,2]")
        }
    }

    //check and assign

    fun hasPrefix(x:Any) = when(x){
        is String-> {
            x.startsWith("prefix")
        }
        else -> false
    }

    println(hasPrefix("Hi is string"))



//==================================
    //loop for inline for

    for (i in intArrayOf(1,2,3,4,5)) println(i)



    //loop asc i++
    for (i in 1 until 5){
        println(i)
    }

    //loop asc i+=2
    for (i in 1 until 5 step 2){
        println(i)
    }


    //loop desc i--
    for (i in 5 downTo 0){
        println("loop desc i-- $i")
    }

    //loop with index

    val listA:IntArray = intArrayOf(1,2,3,4,5)
    for (i in listA.indices){
        println("indices ${listA[i]}")
    }


    //loop index and value
    val listB:IntArray = intArrayOf(6,7,8,9,10)

    for ((index,value) in listB.withIndex()){
        println("the element at $index is $value")
    }

    println("==================================")
    //while and do while
    //i dont test with while loop bcos it the same as java




//==================================
    //return and break statement


    //loop@ here is optional, normally loop@(goto) to use to break loop and jum out form loop duplicate loop


    //it work the same if u remove goto statement(loop@)
    loop@for (i in 1..10){
        if (i==3){
            println("i = $i")
            break@loop
        }else{
            println("will break when i = 3")
        }
    }
    println("\n")


    //it work the same if u remove goto statement(loop@)
    loop@for (i in 1..10){
        if (i==3){
            println("i is $i")
            continue@loop
        }else{
            println("It not break It cont until all the elements")
        }
    }
    println("==================================")



    //inner loop
    //this is we use goto (breakJ@) with break, goto here is optional bcos 'break' alos to go that pint that we set goto(breakJ@)

    //it work the same if u remove goto statement(loop@)
    for (i in 1..10) {
        breakJ@ for (j in 1..10) {
            if (j==1){
                println("i $i j $j")
                break@breakJ
            }else{
                println("this print is not excute bcos loop j is break at the first index")
            }
        }
    }
    println("\n")

    //it work the same if u remove goto statement(gotoJ@)
    for (i in 1..5) {
        gotoJ@ for (j in 1..5) {
            if (j==1){
                println("i $i j $j")
                continue@gotoJ
            }else{
                println("J is not break so will print all the 5x4 times") //why 4 bcos index 1 not print this statement
            }
        }
    }
    println("==================================")





    //the real porpus of goto in kotlin is sortcut to break multi loop
    //here we break two loop just use only one goto statement(loop@)
    loop@for (i in 1..10) {
         for (j in 1..10) {
            if (j==3){
                println("I $i J $j")
                break@loop
            }else{
                println("I $i J $j")
            }
        }
    }
    println("==================================")

    //return labels

    //If we dont use goto@ loop will break all and return
    fun foo() {
        listOf(0,1,2,3,4,5).forEach { index->
            if (index == 3) return
            println(index)
        }
        println("this point is unreachable")
    }
    foo() //=0,1,2
    println("\n")




    //If we use return with goto@ is like continue of loop (it not return to caller it just skip and keep do throught all index)
    fun foo1() {
        listOf(1, 2, 3, 4, 5).forEach lit@{
            if (it == 3) {
                println("It==3 will skip all belove statement and goto up")
                return@lit
            }
            println(it)
        }
        print(" done with explicit label")
    }
    foo1()
    println("\n")



    fun foo2() {
        listOf(1, 2, 3, 4, 5).forEach {
            if (it == 3) return@forEach // the same as foo1() fun
            println(it)
        }
        println(" done with implicit label")
    }
    foo2()
    println("\n==================================")




    //return with goto use with anonymous function


    fun fooFun() {
        listOf(1, 2, 3, 4, 5).forEach(fun(value: Int) {
            if (value == 3) return
            print(value)
        })
        print(" done with anonymous function")
    }
    fooFun()
    println("\n")


    fun fooFun1() {
        run loop@{
            listOf(1, 2, 3, 4, 5).forEach {
                if (it == 3){
                    return@loop // non-local return from the lambda passed to run
                    // rerutn here will skip all loop index
                }
                println(it)
            }
        }
        println(" done with nested loop")
    }
    fooFun1() //1,2

}