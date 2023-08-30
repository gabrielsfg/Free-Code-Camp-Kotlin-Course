package OOP

fun main(){
    val car1: Car = Car() //Create a new car
    car1.color = "red" //Define the color of the car
    car1.name = "BMW" //Define the car model
    car1.model = "320i" //Define car model
    car1.doors = 4 //Define car doors

    println("Name = ${car1.name}")
    println("Model = ${car1.model}")
    println("Color = ${car1.color}")
    println("Doors = ${car1.doors}")

    car1.move()
    car1.stop()

    val car2:Car = Car()
    car2.color = "black" //Define the color of the car
    car2.name = "Volkswagen" //Define the car model
    car2.model = "Gol" //Define car model
    car2.doors = 2 //Define car doors

    println("\n")
    println("Name = ${car2.name}")
    println("Model = ${car2.model}")
    println("Color = ${car2.color}")
    println("Doors = ${car2.doors}")
    car2.move()
    car2.stop()


}


class Car {
    var name: String  = ""
    var model: String = ""
    var color: String = ""
    var doors: Int = 0

    fun move(){
        println("The car $name $model is moving")
    }

    fun stop(){
        println("The car $name $model has stopped")
    }
}