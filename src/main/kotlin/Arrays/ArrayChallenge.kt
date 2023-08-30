package Arrays

import kotlin.math.max

fun main() {
    val numbers: Array<Int> = arrayOf(10, 5, 6, 7, 29, 8, 10)
    var max = MinAndMax(numbers, true)
    var min = MinAndMax(numbers, false)
    println("The max value is $max")
    println("The min value is $min")

}

/*
fun MaxValue(numbers: Array<Int>):Int{
    var max: Int = numbers[0]
    for (i in numbers){
        if (i > max){
            max = i
        }
    }
    return max
}

fun MinValue(numbers: Array<Int>):Int{
    var min: Int = numbers[0]
    for (i in numbers){
        if (i < min){
            min = i
        }
    }
    return min
}

 */


fun MinAndMax(numbers: Array<Int>, searchMax: Boolean): Int {
    var min: Int = numbers[0]
    var max: Int = numbers[0]

    if (searchMax) {
        for (i in numbers) {
            if (i > max) {
                max = i
            }
        }
        return max
    } else {
        for (i in numbers) {
            if (i < min) {
                min = i
            }
        }
        return min
    }
}