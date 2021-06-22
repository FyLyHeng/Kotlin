package SAM


interface IntPredicate {
    fun accept(i: Int): Boolean
}

class MyTest : IntPredicate{
    override fun accept(i: Int) = true

}

