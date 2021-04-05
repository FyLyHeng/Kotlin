package Classes_and_object

fun main(args: Array<String>){

    val p = People("liza","F")
    println(p.classMemberStandForName)

    val customer = Customer("liza")
    println(customer.customerKey)  //Liza
    customer.customerKey.also(::println) //Liza


    val teacher=Teacher()
    val pet = Pet(teacher)

    listOf(pet).also { println(it) }


    val noPrimaryCon = ClassNoPrimaryCon(10)
    noPrimaryCon.also(::print)


    //we cant call that class outsite bcos it set to private
    //val classWithAccessLavalToCon = SetAccessLavalToCon(10,"1")


//=======================================================================
    //Inner Outer class

    val obj = Outer.Inner()
    println(obj.foo())


//=======================================================================
    //create instand of class
    val address:Address = Address()

    //now address and clone is have the same value
    val cloneAddress = copyAddress(address).also { println(it.name) }


//=======================================================================
    //custom setter and getter

    var customSetterAndGetter = CustomSetterAndGetter()

    var z:Int
    z = customSetterAndGetter.x + 5
    z.also(::println)
    customSetterAndGetter.x.also { println(it) }

    customSetterAndGetter.nameProd = "liza"
    var name = customSetterAndGetter.nameProd.also { println(it) }


    //it cant call accessor set bcos it make to private
    //customSetterAndGetter.setterVisibility = 10

    customSetterAndGetter.counter = 10
    var count:Int = customSetterAndGetter.counter
    count.also { println(it) }

}