package OOP

fun main(){
    val car1: car = car("BMW")
    println(car1.name)
    println(car1.model)
    println(car1.doors)

    //Set was called
    car1.name = "Tesla"

}

class car(name:String , var model: String = "320i", var doors: Int = 4){
    var name = name
        get(){
            return "Car name: $field"
        }
        set(value){
            println("$value was assigned to name property")
            field = value
        }

    /*

    GET:
    fun gitName(): String{
        return this.name
    }


    SET is the same thing as this function:
    fun setName(newValue: String){
        this.name = newValue
    }
     */

}