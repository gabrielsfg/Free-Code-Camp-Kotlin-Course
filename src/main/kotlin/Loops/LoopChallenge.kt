package Loops

fun main() {

    var firstNumber = 0
    var lastNumber = 15
    var even = 0
    var odd = 0

    for (i in firstNumber..lastNumber) {
        if (IsEven(i) == true) {
            even++
            println("$i Is Even")
        } else {
            odd++
            println("$i Is Odd")

        }
    }
    println("Total number of even numbers: $even \nTotal number of odd numbers: $odd")
}

fun IsEven(number: Int): Boolean {
    return (number % 2) == 0
}
