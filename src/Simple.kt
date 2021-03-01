import kotlin.concurrent.thread

fun main(args: Array<String>) {
    var str:String
    str = "var key word beable to change"

    val strReady:String
    strReady="val key word not able to change"



    //call function for other class
    var peraon = Person() //when obj person created init block is excuted and assign is after init block

    peraon.name="liza"
    peraon.age = 18
    peraon.displayInfo(peraon.javaClass.toString())


//    var p1 = Person("liza",14)
}