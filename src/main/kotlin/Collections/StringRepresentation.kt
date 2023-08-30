package Collections

fun main() {
    val numbersStrings = listOf<String>("one", "two", "three", "four")
    println(numbersStrings)
    println(numbersStrings.joinToString())

    val listString = StringBuffer("the list of numbers: ")
    println(numbersStrings.joinTo(listString))

    println(numbersStrings.joinToString(separator = " | ", prefix = "Start: ", postfix = ": end"))

    val numbersRange = (1..100).toList()
    println(numbersRange.joinToString(limit = 15, truncated = "<...>"))

    println(numbersStrings.joinToString {"Element: ${it.uppercase()}"})


}