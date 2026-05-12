fun main() {
    //val message = "The value is ${10/0}" //Code CRASH!

    try {
        val message = "The value is ${10/1}"
        println("1- $message")
    } catch (error: Throwable) {
        println("1- Error was thrown")
    }


    val message =  try {
        throw IllegalStateException()
        "The value is ${10/0}"
    } catch (error: ArithmeticException) {
        "Error was thrown"
    } catch (error: java.lang.IllegalStateException) {
        "Error was IllegalState"
    }

    println("2- $message")
}