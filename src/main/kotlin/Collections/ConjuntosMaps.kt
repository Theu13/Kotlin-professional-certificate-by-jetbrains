package Collections

fun main() {

    val languages: MutableSet<String> = mutableSetOf("Kotlin", "java", "c++", "Kotlin")
    //não permite duplicidade
    for (language in languages) {
        println(language)
    }
    languages.size
    println(languages.contains("Kotlin"))

    languages.add("JavaScript")
    languages.remove("JavaScript")

    //map
    val testScores = mapOf(Pair(123, 91.2), Pair(456, 84.5), 789 to 79.1)
    println(testScores[789])

    for (record in testScores) {
        println("Score for user ${record.key} was ${record.value}")
    }

}