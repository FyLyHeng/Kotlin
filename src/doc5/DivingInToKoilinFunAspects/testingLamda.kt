package doc5.DivingInToKoilinFunAspects

import java.awt.Color

fun toSentenceCase(input:String) : String{
    return input[0].toUpperCase() + input.substring(1)
}


fun getName(input: String, myFun : (String) -> String):String{
    return myFun(input)
}

fun getListOfName(names:Any,myFun: (Any) -> List<String>):List<String>{
    return myFun(names)
}



fun main(args: Array<String>) {

    toSentenceCase("hello").also { println(it) }
    getName("liza") { toSentenceCase(it) }.also { println(it) }

    //1 type of benifit of Hight level fun
    val listOfName = listOf("red","green","blue")

    val a = listOfName.map { toSentenceCase(it) }
    println(a)

    val b = listOfName.filter { it.contains("r") }
    val c = listOfName.filter { it.contentEquals("red") }
    println(c)


}