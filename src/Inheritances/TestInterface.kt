package Inheritances

// open class
open class Base(p:Int)

class Derived(d:Int) :Base(d)


//override method
//super class
open class Home{
    //-----override properties-----
    open val vat:Int = 5
    val tax:Int = 10

    //-----override method-----
    open fun draw(){
        println("Draw form Home Class")
    }
    fun fill(){
        println("This method not allow to override")
    }
    open fun peint(){
        println("peint from Home")
    }
}



//sub class
class HomeE1() : Home() {
    override val vat: Int = 10

    //-----override method-----
    override fun draw() {
        println("Draw from Home E1")
    }

    //this final is auto bcos this class aleady final
    final override fun peint() {
        println("Fill in Home E1 not allow to child override again")
    }

    //accessors super class by keyword 'super'

    fun testAccessSuperClass(){
        println("Tax default Home : ${super.tax}")
        println("Vat default Home : ${super.vat}")
        println("vat Home E1 : ${vat}")
    }


}