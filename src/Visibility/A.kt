package Visibility

open class A internal constructor(a:Int){
    private val aa = a
    protected open val b = 2
    open internal var name = "name"
    open public val c = 3

}

class B : A(10) {
    //aa not visible
    override val b: Int = 22
    override var name: String = "new name"
    override val c: Int = 33


}