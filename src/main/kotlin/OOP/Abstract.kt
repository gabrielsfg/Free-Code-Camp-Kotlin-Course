package OOP

fun main(){

    val circle: Circle = Circle(5.00)
    circle.calculateArea()
    circle.printDescription()
}

abstract class Shape {
    abstract fun calculateArea(): Double
    fun printDescription() {
        println("This is a shape.")
    }
}

class Circle(private val radius: Double) : Shape() {
    override fun calculateArea(): Double {
        return Math.PI * radius * radius
    }
}

class Rectangle(private val width: Double, private val height: Double) : Shape() {
    override fun calculateArea(): Double {
        return width * height
    }
}