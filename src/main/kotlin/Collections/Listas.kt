package Collections

fun main() {

    val stringList: List<String> = listOf("Kotlin", "Code", "puppy")
    val listOfInt = listOf(1, 2, 3, null)

    val doubleValues = List<Int>(5) { index ->
        2 * index

    }

    doubleValues.forEach { println(it) }

    val emptyStringList: List<String> = emptyList()

    //acessar elementos

    val firstInt = listOfInt.get(0)
    val secondInt = listOfInt[1]

    //mutable list
    val languages = mutableListOf("Kotlin", "Java") //size 2
    languages[0] = "Kotlin"
    languages.set(0, "Kotlin")

    languages.add("JavaScript")
    languages.add(1, "C++") //update
    languages.remove("JavaScript") //remove element
    languages.removeAt(0) //remove at index

    val aList: List<String> = mutableListOf("Dog", "Cat")



}