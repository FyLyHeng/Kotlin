package Interfaces

interface Name{
    //--- property----
    val name:String

}

interface Person:Name{

    val firstName:String
    val lastName:String

    override val name: String
        get() = "$firstName $lastName"


    //--- method----
    fun displayName()
    fun displayEmployeeInfo()
}





//those two fun mast override
class Employee (override val firstName: String, override val lastName: String,val position:String):Person{
    override fun displayName() {
        println("Full Name : ${super.name}")
    }

    override fun displayEmployeeInfo() {
        println("E-Info : ${firstName}- $lastName - $position")
    }
}