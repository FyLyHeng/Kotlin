package Classes_and_object

import java.lang.annotation.Inherited
import javax.security.auth.Subject

//init block
class People(name: String, sex: String) {
    val classMemberStandForName: String = "Fist property: $name".also(::println) //= println(nameA) =Fist property: liza


    init {
        println("First init Property $name")
    }

    val classMemberStandForSex: String = "Second property: ${sex.length}".also(::println)

    init {
        println("Second initializer block ${sex.length}")
    }

}


//=======================================================================
//easy assign value from con params to class member
class Customer(name: String) {
    val customerKey = name.toUpperCase()
}


//=======================================================================
// we can spicific val(read-only) var(read-write)
// to parameter of primary const
class Person(val fName: String, val lName: String, var age: Int = -1)


//=======================================================================
// set access level
class Animal private constructor(name: String)


//=======================================================================
//Secondary constructors

class Teacher(val pets: MutableList<Pet> = mutableListOf())

class Pet {

    constructor(owner: Teacher) {
        owner.pets.add(this)
    }


}


//=======================================================================
class ClassNoPrimaryCon {
    init {
        println("Im init block")
    }

    constructor(i: Int) {
        println("Im i $i")
    }
}


//=======================================================================
//private con is mean can use only in this class
class SetAccessLavalToCon private constructor(age: Int, name: String) {
    val userAge = age
    val userName = name
}


//=======================================================================
//inner class
class Outer {
    private val bar: Int = 1

    class Inner {
        fun foo() = 2
    }
}

class Address {
    var name: String = "Holmes, Sherlock"
    var street: String = "Baker"
    var city: String = "London"
    var state: String? = null
    var zip: String = "123456"
}

fun copyAddress(address: Address): Address {
    val result = Address()

    result.name = address.name
    result.street = address.street
    result.city = address.city
    result.state = address.state
    result.zip = address.zip

    return result
}


//=======================================================================
//custom setter and getter

class CustomSetterAndGetter {

    //custom getter
    //when get x is call will get value 20
    var x: Int = 0
        get() = 20

    val xShort get() = 20


    var nameProd: String
        get() = "Default name"
        set(value) {
            setOf<String>("Hi- $value")
        }


    var setterVisibility: String = "text"
        private set


    //this is how kotlin assige value to alocate memory
    //it assign vai spicel keyword 'field'
    // 'value' is the spical aurgment it get value from client (caller)
    var counter = 0
        set(value) {
            if (value < 0) {
                println("value is $value. it < 0 default is 0")
                field = 0
            }
        }


    //backing operation
    //bigger than backing field above
    // val table is mean we not allow to setter to this field derict
    // but can set by other field call _table

    var _table: Map<String, Int>? = null
    val table: Map<String, Int>
        get() {
            if (_table == null) {
                println("_table is null")

                //create new HasMap obj empty value
                _table = HashMap()
            }
            return _table ?: throw AssertionError("Set to null by another thread")
        }
}


// age is nullable

class CustomerGetter(val name:String,var gender:String, val age:Int){

    //use lateinit for tell kotlin this var i dont want init or assige value now, but i want later or when i call this class
    lateinit var ln:String
    private val isOld : Boolean
        get() {
            return age >= 18
        }


    fun display(){
        println("Age = $age  --- is old = $isOld")
    }

}
//======================

//class TestLateInit{
//    //compile-time constants
//    const val SUBSYSTEM_DEPRECATED : String = "this var need to init to pass requriment"
//    @Deprecated(SUBSYSTEM_DEPRECATED) fun foo(){}
//}


//==============================
//late initialized properties and variable
class TestSubject{
    fun showMe(){
        println(this.javaClass)
    }
}


class MyTest{
    lateinit var subject: TestSubject
}





