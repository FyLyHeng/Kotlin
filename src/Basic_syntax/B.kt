package Basic_syntax

class B :A() {
    override fun foo(i: Int): Int {
        return i*2
    }

    fun foo(bar:Int = 0, baz:Int): Int {
        return bar-baz
    }
}