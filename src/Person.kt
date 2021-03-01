//this is [primary] (_name: String="", _age: Int=-1)
class Person(_name: String = "default value of paramter", _age: Int = -1) {


    // in kotlin we have two type of constructor [Secondary]
    //constructor()
//    constructor(name: String, age: Int, _type: String) {
//        this.name = name
//        this.age = age
//        this.type = _type
//    }


    var name: String = ""
    var age: Int = 0
    var type: String = ""

    //this init block we can set default value to properties of class
    init {
        name = _name.capitalize()
        age = _age
        displayInfo(this.javaClass.toString())
    }


    fun displayInfo(classCalled: String) {
        println("Init block called by $classCalled")
        println("Name ${this.name}")
        println("age ${this.age}")
    }

    fun displayScore(rang: IntRange) {
        rang.onEach {
            println(it)
        }
    }

}