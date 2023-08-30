package Collections

fun main(){
    val numbersCollection = listOf<String>("one", "two", "three", "four", "five")
    println(numbersCollection.groupBy { it.first().uppercase() })
    println(numbersCollection.groupBy(keySelector = {it.length}, valueTransform = {it.uppercase()}))
}