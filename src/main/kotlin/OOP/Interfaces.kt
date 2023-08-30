package OOP

fun main(){
    var vehicle1: CarInt = CarInt("Civic", "Blck")
    var vehicle2: Truck = Truck("Mercedes", "White")
    var vehicle3: PlaneInt = PlaneInt("Boeing", "Green")
    var vehicle4: Tesla = Tesla("Tesla", "Red")

    vehicle1.startEngine()
    vehicle2.startEngine()
    vehicle3.startEngine()
    vehicle4.startEngine()
}

interface Engine{
    fun startEngine()
}

class CarInt(val name: String, val color: String): Engine{
    override fun startEngine() {
        println("The car is starting the engine")
    }

}

class Truck(val name:String, val color: String): Engine{
    override fun startEngine() {
        println("The Truck is starting the engine")
    }
}

class PlaneInt(val name: String, val color: String): Engine{
    override fun startEngine() {
        println("The Plane is starting the engine")
    }
}

class Tesla(val name: String, val color: String): Engine{
    override fun startEngine() {
        println("Tesla is starting the engine")
    }
}