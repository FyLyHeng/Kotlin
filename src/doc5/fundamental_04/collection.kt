package doc5.fundamental_04

val number = listOf(1,2,3)
val mnumber = mutableListOf(1,2,3)

val person = mapOf("name" to "dara", "age" to 20)
val mperson = mutableMapOf("name" to "dara", "age" to 20)

fun main() {
    // data type list cant add or remove it read only
    //number.add(4)
    //person.put("position" to "it")

    mnumber.add(4)
    mperson["position"] = "IT"
}