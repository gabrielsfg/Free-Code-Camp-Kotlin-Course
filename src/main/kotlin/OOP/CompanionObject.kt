package OOP

fun main(){
    var result = Calculator.sum(10, 5)
    println(result)

}

class Calculator(){
    companion object{
        fun sum(a:Int, b: Int): Int = a + b
    }

}