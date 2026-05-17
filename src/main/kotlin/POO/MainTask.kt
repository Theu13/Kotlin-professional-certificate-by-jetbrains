package POO

fun main() {
    val task1 = Task("a1","Build search feature")
    val task2 = Task("b2", "Add analytics")

    println(task1)
    println(task2)

    //val task2Copy = task2.copy(id = "c3)

    if (task1.name == task2.name) {
        println("Tasks are the same")
    } else {
        println("Tasks are different")
    }

}