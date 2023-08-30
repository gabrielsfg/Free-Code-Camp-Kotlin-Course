package OOP

fun main(){
    val plane1: Plane = Plane("Boeing", "red", 40, 3)
    plane1.move()

    val moto1: Motorcycle = Motorcycle("suzuki", "black", 5)
    moto1.move()
    moto1.stop()

}

open class Vehicle(val name: String, val color: String){
    open fun move(){
        println("$name is moving\n")

    }

    open fun stop(){
        println("$name has stopped")
    }
}

class Plane( name: String, color: String, val engines: Int, val door: Int): Vehicle(name, color) {
    override fun move() {
        flying()
        super.move()
    }

    fun flying(){
        println("The plane is flying")
    }

}

class Motorcycle(name: String, color: String, val engines: Int): Vehicle(name, color){

}