package doc5.fundamental_03

class CustomerImp : CustomerEventListener {

    override fun customerSaved(customer: Customer) {
        println("saved")
    }

    override fun customerDeleted(customer: Customer) {
        println("deleted")
    }

    fun getMe(): List<String> {
        return listOf("a","b")
    }

}