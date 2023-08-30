package Functions

fun main(){
    val max = getMax(5, 8, 10)
    println(max)
}

private fun getMax(a:Int, b:Int) = if (a>b) a else b

private fun getMax(a:Double, b:Double) = if (a>b) a else b

private fun getMax(a:Int, b:Int, c:Int): Int {
    if (a > b && a > c)
        return a
    else if (b > a && b>c)
        return b
    else
        return c
}