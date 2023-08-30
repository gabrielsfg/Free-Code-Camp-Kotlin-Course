package Collections

fun main(){
    val numbersOperators = mutableListOf("one", "two", "three")
    val plusList = numbersOperators + "five"
    val minusList = numbersOperators - "two" - "one"

    println(plusList)
    println(minusList)

}