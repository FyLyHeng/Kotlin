package doc5.fundamental_04

fun printNames(vararg names:String){
    names.forEach {
        println(it)
    }
}


//change order of parameter vararg
fun greetNames(vararg name: String, greeting:String){
    name.forEach {
        println("$greeting : $it")
    }
}


//pass forward vararg to other fun
fun greetNameWithHeader(vararg name: String, header:String){
    println("===$header===")

    //we cant use name dirct we need to convert with * symbol
    //printNames(name)
    printNames(*name)
}

//pass list of string to vararg
fun greetNameWithHeader(name: List<String>, header:String){
    println("===$header===")

    //we cant use name dirct we need to convert with toTypedArray()
    //printNames(name)
    printNames(*name.toTypedArray())
}


fun main(args: Array<String>) {
    printNames("liza","kok")
    greetNames("liza","kok", greeting = "Hello")
    greetNameWithHeader("liza","jonh",header = "List of Name")
    greetNameWithHeader(listOf("liza","jonh"),header = "List of Name")
}