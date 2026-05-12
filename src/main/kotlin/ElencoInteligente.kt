fun main() {
    val generic: Any = "Salve"
    //val anInt: Int = generic as Int //anInt como uma generic como Int


    checkType(generic)
}

fun checkType (input: Any?) {


    if (input is String?) {

        if (input == null) {
            println("Input was a null string")
        } else {
            println("Input is a String with length ${input.length}")
        }
    }

    if (input !is Int) {
        println("Input is not an Int")
    }
}