package doc5.fundamental_04

import Basic_syntax.sum
import kotlin.reflect.full.declaredMemberProperties

data class Person(val name: String, val age:Int)

val people = listOf<Person>(
    Person("john dara",24),
    Person("liza Kok",20),
    Person("kok john",28)
)

val emptyPeople = emptyList<Person>()

object Result {
    val ages = people.map { it.age }
    val firstNames = people.map { it.name.substringBefore(" ") }
    val totalPerson = people.map { it.age}.count()
    val totalSafePerson = people.map { it.age}.fold(0){acc , i-> acc +i }
    val avgPerson = people.sumBy { it.age }.div(totalPerson)
    val orderDESCPeoples = people.map { it.age }.sorted().reversed()
    val peopleSortedByAge = people.sortedBy { it.age }
    val peopleSortedByName = people.sortedBy { it.name }
    val peopleNameSortedByAge = people.sortedBy { it.age }.map { it.name }

}

fun main(args: Array<String>) {
    Result::class.declaredMemberProperties.forEach {
        println("${it.name}: ${it.get(Result)}")
    }
}
