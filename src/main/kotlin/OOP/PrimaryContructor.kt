package OOP

fun main(){
    val cars1= Cars("Hyundai", "Creta", "White", 4)
    println("Name = ${cars1.name}")
    println("Model = ${cars1.model}")
    println("Color = ${cars1.color}")
    println("Doors = ${cars1.doors}")
    cars1.move()
    cars1.stop()

}

class Cars(var name:String, var model:String, var color: String, var doors: Int){
    fun move(){
        println("The car $name $model is moving")
    }

    fun stop(){
        println("The car $name $model has stopped")
    }
}