package doc5.fundamental_04

fun main() {
    for (i in 1..10) println(i)

    do {
        val index = Math.random() * mnumber.size
        val number = number[index.toInt()]
        println("Random $number")
    }while (number != 3)

    //Break to labels

    outer@ for (i in 1..100){
        for (j in 1..10){
            if (i == 6 && j ==2){
                break@outer
            }
            println("i=$i, j=$j")
        }
    }

    //Iterating maps with entity
    for (entity in person){
        println("${entity.key} is ${entity.value}")
    }

    //this two code work the same but the last one is more readable
    for ((name, age) in person){
        println("$name is $age")
    }
}