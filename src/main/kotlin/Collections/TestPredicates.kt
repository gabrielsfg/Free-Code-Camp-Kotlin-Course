package Collections

fun main(){
    val numbersTest = listOf<String>("one", "two", "three", "four")
    println(numbersTest.any {it.endsWith("e")})
    println(numbersTest.none { it.endsWith("w") })
    println(numbersTest.all { it.length > 1 })
}