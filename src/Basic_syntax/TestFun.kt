package Basic_syntax


    // ===========void==============
    fun outPutVoid(score:Int,name:String){
        println("output $score -- $name")
    }

    // ===========void==============
    fun outPutType1(score:Int, name:String){
        println("output $score -- $name")
        //return "Hello "
    }

    fun outPutType2(score:Int,name:String): String {
        println("output $score -- $name")
        return "Hello "
    }

fun output1(a:String,b:String):Unit{
    //util def or void in java
    println("output1 $a -- $b")
}


// ===========return type==============

fun sum(a:Int,b:Int) = a+b

fun mulit(a:Int,b:Int):Int = a*b


fun powerOf(
    number:Int,
    expont:Int
): Int {
    return number*expont
}

// ===========Default arguments﻿==============

fun read (
    b:String,
    off:Int = 0,
    len:Int = b.length
){
    println("b is $b off is $off len is $len")
}


    //===== overloading fun ======
    fun foo(i: Int): Int {
        return i*2
    }

    fun foo(bar:Int = 0, baz:Int): Int {
        return bar-baz
    }

    fun foo(
        bar: Int = 0,
        baz: Int = 1,
        qux: ()-> Unit
    ): () -> Unit {
        return qux
    }

    fun foo(vararg str:String): Array<out String> {
        return str
    }



//=========Named arguments======
fun reformat(
    str:String,
    normalizeCase:Boolean = true,
    upperCase:Boolean = true,
    divi:Boolean = false,
    wordSeparator:Char=' '
): String {
return """
    str: $str
    normalize: $normalizeCase
    upperCase: $upperCase
    divi: $divi
    wordSeparator: $wordSeparator
""".trimIndent()
}


//======= Unit-returning functions =============
//If a function does not return any useful value, its return type is Unit
// key word Unit is optional

fun printHello(name:String):Unit{
    if (name != null){
        println("Hello $name")
    }else {
        println("Hi there!")
    }
}


//======= Single-expression functions﻿ ======
// fun that have one line to complete with return

fun double(x:Int): Int = x*2

fun inte(x:Int) = x+1

//======= Explicit return types =========
/**
 * Explicit return types﻿
Functions with block body must always specify return types explicitly, unless it's intended for them to return Unit, in which case it is optional.
Kotlin does not infer return types for functions with block bodies because such functions may have complex control flow in the body, and the return type will be non-obvious to the reader (and sometimes even for the compiler).
 */

//======= Variable number of arguments (Varargs)﻿ =======

fun <T> asList(vararg ts:T): List<T>{
    val result = ArrayList<T>()

    for (t in ts)
        result.add(t)

    return result
}


// ===== Infix notation ======
// fun that can all by using .
// when call we can use .sub for each var is Int type

infix fun Int.sub(x:Int):Int{
    return x+3
}


//===== Generics  =====

fun <T> event(type:T){

    println(type.toString())

}

fun <T> event1(type:T?=null){ //set default value = null

    if (type!=null)
        println(type.toString())
    else
        println("Empty params")
}


fun <T,V> event(type:T,data:V){

    println(type.toString())
    println(data.toString().length)

}





