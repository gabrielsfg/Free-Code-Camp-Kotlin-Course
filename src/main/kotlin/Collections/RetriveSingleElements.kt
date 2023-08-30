package Collections

fun main(){
    val numbers = listOf<String>("one", "two",  "three",  "four", "five", "six")
    println(numbers.elementAt(3))
    println(numbers.first())
    println(numbers.last())

    println("\n")

    println(numbers.first {it.length>3})
    println(numbers.last {it.startsWith("fo")})
    println(numbers.random())
    println(numbers.isEmpty())
}