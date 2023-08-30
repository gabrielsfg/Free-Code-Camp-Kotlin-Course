package OOP

fun main(){
    val cat: Animal = Animal("Dog", "BullDog", 5)

    cat.favoriteFood = "Fish"
    println(cat.favoriteFood)
}

class Animal(var firstName:String = "FirstName", var lastName:String = "LastName", var age:Int = 0) {
    lateinit var favoriteFood:String //This var will be initialized later on the program
}