package Operators

fun main() {
    //NOT !
    var x = 100
    if (x != 100) {
        println("x is not 100")
    } else {
        println("x is equal 100")
    }

    //AND &&
    val isPlaying = true
    val score = 80
    if (isPlaying && score == 100) {
        println("Next Level opened")
    } else {
        println("Still ot the same level")
    }

    // OR ||
    val num1 = 5
    val num2 = 4
    if (num1 > 0 || num2 > 100) {
        println("Correct")
    } else println("WRONG")
}