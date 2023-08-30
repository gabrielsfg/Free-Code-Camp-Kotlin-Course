package Functions

fun main() {
    var max: Int = getMax(41, 52)
    println(max)

}

private fun getMax(a: Int, b: Int): Int {
    val max = if (a > b) a else b
    return max
}

