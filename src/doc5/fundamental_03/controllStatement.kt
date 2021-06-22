package doc5.fundamental_03

import java.awt.Color
import java.net.InetAddress
import java.net.UnknownHostException

data class Person (val name:String, val age:Int)

fun main() {
    val p1 = Person("jonh",18)
    val p2 = Person("alix",20)

    val oldest = if (p1.age>p2.age){p1}else{p2}
    oldest.also { println(it) }


    fun getColor(person: Person) : Color = when(person.age){
        in 1..10 -> Color.GREEN
        in 11..18 -> Color.ORANGE
        else -> {
            Color.BLUE
        }
    }

    fun isValidIP(host:String) = try {
        InetAddress.getByName(host)
        true
    }catch (ex:UnknownHostException){
        false
    }
}