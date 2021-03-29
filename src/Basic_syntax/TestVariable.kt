package Basic_syntax

fun main(args: Array<String>){

    //style 1 init value when create obj
    //it smart to know data type
    val ln = "KH"
    var score = 95

    //style 2 init value and define Datatype
    val lns : String = "EN"
    var scores: Int = 95

    //style3 crate obj
    //and set value after
    val lnss : String
    var scoress:Int

    //do s.th
    lnss = "ES"
    scoress = 95
//-----------
//int
    var num:Int
    num = 1_000_000
    println(num) //= 1000000

    var lnum:Long
    lnum = 1_00_00_00L
    println(lnum) //= 1000000


//float
    var fnum = 1.2f
    println(fnum) //= 1.2

    var dnum = 112.1
    println(dnum.javaClass) //= double

//operation ?
    var a:Int=100
    val boxA :Int?=a
    val otherBoxA:Int?=a

    println(boxA===otherBoxA)


//string // every thing is like java and groovy

    val text = """
    |Tell me and I forget.
    |Teach me and I remember.
    |Involve me and I learn.
    |(Benjamin Franklin)
    """.trimMargin("|")

    println("This is test var - val")
    println(text)


//array
    var x:IntArray = intArrayOf(1,2,3,1)

    x[1]    //=2

    x= intArrayOf(3,4,5,6)

    x[1]    //=4
    x.get(1)//=4

    //limit size array
    var y = IntArray(5)

    y   //= [0,0,0,0,0]
    y.set(1,10) //= y[1] = 10

    y   //= [0,10,0,0,0]


    val z = IntArray(5){10}
    z //= [10,10,10,10,10]


    val zz = IntArray(5){it*1} // crate list 5 element and value is [1,2,3,4,5]
    zz //= [1,2,3,4,5]

    var z1 = (1..5).toList().toTypedArray() // create list that index is base on rang of result is [1,2,3,4,5]
    z1      //= [1,2,3,4,5]

    val z2 = z1.sliceArray(0..2) //z2 is subList of z1 start form index 0 -> index 2
    z2      //= [1,2,3]




//loop and assign

    z2.forEachIndexed { index, i ->
        z2.set(index,i+index+2)
    }

    z2.forEach { i -> println(i) }






}