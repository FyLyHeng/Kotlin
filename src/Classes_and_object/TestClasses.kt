package Classes_and_object

import java.lang.annotation.Inherited

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
class Person(val fName: String, val lName: String, var age: Int = -1) {

}


//=======================================================================
// set access level
class Animal private constructor(name: String) {}


//=======================================================================
//Secondary constructors

class Teacher(val pets: MutableList<Pet> = mutableListOf()) {}

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

//
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
    var counter = 0
        set(value) {
            println("value > 0")
            if (value < 0) field = value
        }

    private var _table: Map<String, Int>? = null
    public val table: Map<String, Int>
        get() {
            if (_table == null) {
                _table = HashMap()
            }
            return _table ?: throw AssertionError("Set to null by another thread")
        }
}





