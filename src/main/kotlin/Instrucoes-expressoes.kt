fun main() {
    var someVariable = 0
    val message = if (someVariable > 3) {
        "The value is greater than 3!"
    } else {
        "The value is NOT greater than 3!"
    }

    println(message)

    var someVariable2 = 0
    val message2 = when(someVariable) {
        3 -> "The value is 3"
        else -> "The value is NOT 3"
    }

    println(message2)

}
//Fun with if
fun getMesssage(input : Int) = if (input > 3) {
        "Greater than 3"
    } else {
        "Not greater than 3"
    }

//Fun with when
fun getMessageWithWhen(input: Int) = when (input) {
    3 -> "Value is 3"
    else -> "Value is not 3"
}
