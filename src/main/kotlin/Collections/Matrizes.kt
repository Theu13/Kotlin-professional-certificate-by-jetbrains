package Collections

fun main() {

    val ints =  arrayOf(1, 2, 3, 4, null)

    val nulls = arrayOfNulls<Int>(5)

    val custom = Array(5) { index -> index }

    val sizeOfArray = ints.size //return 5

    val firstValue = ints[0] //primeiro valor da array
    ints.set(0, 99) //alocar um valor em uma posição na array.
    ints[0] = 99

    val primitiveInts = intArrayOf(1, 2, 3, 4, 5)
    val primitiveUshorts = ushortArrayOf(1u, 2u, 3u, 4u, 5u)

//    for (i in 0 until ints.size) {
//        println(ints[i])
//    }
//
//    for (element in ints) {
//        println(element)
//    }
//
//    ints.forEach { element -> println(element) }

    greetThings("Hey", arrayOf("Kotlin", "Programming"))
    

}

fun greetThings(greeting: String, vararg items: Any) {

    for (item in items) {
        println("$greeting $item")
    }

}