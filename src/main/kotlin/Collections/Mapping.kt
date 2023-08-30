package Collections

fun main() {
    val numbers = setOf(1, 2, 3, 4, 5)
    println(numbers)
    println(numbers.map { it * 10 })
    println(numbers.map { if (it == 3) it * 100 else it * 2})
    println(numbers.mapIndexedNotNull{ index, value -> if (index == 0) null else index * value })

    val numbersMap = mapOf("Key 1" to 1, "Key 2" to 2, "Key 3" to 3, "Key 4" to 4)
    println(numbersMap.mapKeys {it.key.uppercase()  })
    println(numbersMap.mapValues {it.value + it.key.length  })

}

