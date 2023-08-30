package Collections

fun main(){
    val numbers = listOf<Int>(6, 10, 14, 5, 100)
    println(numbers.sum())
    println(numbers.count())
    println(numbers.average())
    println(numbers.max())
    println(numbers.min())
    println(numbers.maxOrNull())
    println(numbers.minOrNull())
    println(numbers.sumOf { it * 2 })

}