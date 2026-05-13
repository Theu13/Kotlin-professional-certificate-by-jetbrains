package IO

import java.io.File

fun main() {
    print("Enter a filename: ")
    val filename = readLine() ?: ""
    println("Your filename is $filename")

    val isValidFile = File(filename).isFile

    if (isValidFile) {
        println("Its a valid file")
    } else  {
        println("Its not a valid file")
    }
}