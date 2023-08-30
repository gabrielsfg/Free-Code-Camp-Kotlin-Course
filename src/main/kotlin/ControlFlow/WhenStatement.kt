package ControlFlow

fun main() {
    val alarm = 7
    val number = 5

    when (alarm) {
        12, 14 -> println("The time is $alarm")
        in 1..10 -> println("The number is in the range 1 to 10 and the number is $alarm")
        //9 -> println("The time is $alarm")
        //14 -> println("The time is $alarm")
        else -> println("The time is $alarm")
    }

    val text = when (number) {
        !in 5..10 -> {
            "The number is not in 5..10"
        }

        0, 5, 10 -> {
            "the number is $number"
        }

        else -> {
            "It's not a number"
        }
    }
    println(text)

    //Boolean em when
    val test = when {
        alarm <= 10 -> "Option 1"
        else -> "option 2"
    }
    println(test)
}