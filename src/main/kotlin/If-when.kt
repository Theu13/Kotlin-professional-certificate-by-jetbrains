fun main() {
    //Basic
    if (true) {
        var someVariable = 100

        println("IF:")
        //1:
        if (someVariable > 3) {
            println("granter than 3 ")
        } else if (someVariable < 3) {
            println("not granter than 3")
        } else {
            println("equal")
        }

        println("WHEN:")
        //2:
        when {
            someVariable > 3 -> println("greater than 3")
            someVariable > 2 -> println("greater than 2")
            else -> println("not greater")
        }

        println("WHEN ARGUMENT:")
        //3
        when (someVariable) {
            0,1 -> println("The value is 0 or 1")
            2 -> println("The value is 2")
            3 -> println("The value is 3")
            in 4..Int.MAX_VALUE -> println("The value is greather than 3")

        }


    }

}