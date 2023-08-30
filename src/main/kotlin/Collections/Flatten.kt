package Collections

fun main(){
    val numbersArrays = arrayOf(arrayOf(1, 2, 3), arrayOf(4, 5, 6), arrayOf(7, 8, 9))
    println(numbersArrays[2][2])

    val numbersSets = listOf(setOf(1, 2, 3), setOf(4, 5, 6), setOf(7, 8, 9))
    for (numbers in numbersSets){
        for (number in numbers){
            println(number)
        }
        println("\n")
    }
    val numbersFlatten = numbersSets.flatten()
    println(numbersFlatten[8])
    for (numbers in numbersFlatten)
        println(numbers)
}