fun main() {

    println("=== Lobby ===")
    println("1- Function High Order: ")

    println("Exemple: ")
    printCalculatedValue(2, 2) { value1, value2 ->
        value1 + value2
    }

    printCalculatedValue(2, 2, { value1, value2 ->
        value1 - value2
    })

    println("Exercise: ")

    formatName("Nate", "Ebel", basicFormatter)
    formatName("Nate", "Ebel", fancyFormatter)

    formatName("Nate", "Ebel") { first, last ->
        "$last, $first"
    }


}


// Function High Order
fun printCalculatedValue(value1: Int, value2: Int, calculator: (Int, Int) -> Int) {
    println("The value is: ${calculator(value1, value2)}")
}

// Exercise: write a function that satisfies the following requirements
// function takes 2 strings for first and last name
// function takes a formatting function parameter
// function should print the result of the passed format function

fun formatName(first : String, last : String, formatter: (String, String) -> String) {
    println(formatter(first, last))
}

val basicFormatter: (String, String) -> String = { first, last ->
    "$first $last"
}

val fancyFormatter: (String, String) -> String = { first, last ->
    "first name is $first and last name is $last"
}
