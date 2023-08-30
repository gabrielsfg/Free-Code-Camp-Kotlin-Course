package Variables

fun main(){
    //Creating a Variable
    var userName: String = "Gabriel"
    println("Hello $userName")

    //Changing the variable
    userName = "Matheus"
    println("Hello $userName")

    //Creating a Value, Values cannot be change
    val userAge: Int = 23
    println("My name is $userName and I have $userAge")
}