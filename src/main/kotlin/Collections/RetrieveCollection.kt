package Collections

fun main(){
    val numbersRetrieve = listOf<String>("one", "two",  "three",  "four", "five", "six")
    println(numbersRetrieve.slice(1..3))
    println(numbersRetrieve.slice(0..4 step 2))
    println(numbersRetrieve.slice(setOf(3, 4, 0)))

    println("\n")

    println(numbersRetrieve.take(3))
    println(numbersRetrieve.takeLast(3))
    println(numbersRetrieve.drop(1))
    println(numbersRetrieve.dropLast(5))
    println(numbersRetrieve.dropLast(1))

    println("\n")

    println(numbersRetrieve.takeWhile { !it.startsWith("f") })
    println(numbersRetrieve.takeLastWhile { it != "three" })
    println(numbersRetrieve.dropWhile { it.length == 3 })
    println(numbersRetrieve.dropLastWhile { it.contains("i")})

    println("\n")

    val numbers = (0..13).toList()
    println(numbers.chunked(3))
    println(numbers.chunked(3){it.sum()})

    println("\n")

    println(numbersRetrieve.windowed(3))
}