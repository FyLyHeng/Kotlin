package doc5.fundamental_03


interface CustomerEventListener{
    fun customerSaved(customer:Customer)
    fun customerDeleted(customer: Customer)
}

data class Customer (val name:String)


class CustomerService{
    companion object{
        private val listeners = mutableListOf<CustomerEventListener>()

        @JvmStatic
        fun addListener(listener: CustomerEventListener){
            listeners.add(listener)
        }
    }

    fun me(customer: Customer){
        listOf(customer)
    }


    fun save(customer: Customer){
        listeners.forEach{
            it.customerSaved(customer)
        }
    }

    fun delete(customer: Customer){
        listeners.forEach {
            it.customerDeleted(customer)
        }
    }
}

fun main(array: Array<String>) {
    val service = CustomerService()
    val customerImp = CustomerImp()
    CustomerService.addListener(customerImp)


    val customer = Customer("liza")
    service.save(customer)
    service.delete(customer)
}