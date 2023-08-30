package Collections

fun main(){
    val numbersFilter = listOf<String>("one", "two", "three", "four")
    val longerThanThree = numbersFilter.filter { it.length > 3 }
    println(longerThanThree)

    val numbersMap = mapOf("key 1" to 1, "key 2" to 2, "key 101" to 101, "key 103" to 103, "key 102" to 102,)
    val filterMap = numbersMap.filter { it.key.endsWith("1") && it.value > 100 }
    println(filterMap)

    val filterIndex = numbersFilter.filterIndexed{index, value -> (index != 0) && (value.length < 5) }
    val filterNot = numbersFilter.filterNot { it.length <= 3 }
    println(filterIndex)
    println(filterNot)

    val mixedList = listOf(1, 2, 3, 'A', 'B', "one", "Hello World", false)
    mixedList.filterIsInstance<Char>().forEach {
        println(it)
    }

    //PARTITION
    val (match, rest) = numbersFilter.partition { it.length > 3 }
    println(match)
    println(rest)

}