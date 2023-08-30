package ControlFlow

fun main(){
    val isActive = true
    if(isActive){    // if(isActivie == true) eh a mesma coisa
        println("IsActive")
    }else {
        println("Is not Active")
    }

    val myNumber = 70
    if(myNumber > 100){
        println("The number is greater than 100")
    }else if(myNumber >  50){
        println("The number is greater than 50")
    }else{
        println("My number is greater than 0, but lower than 50")
    }

    val myNumber2 = 100
    if(myNumber2 >= 100){
        println("The number is greater than 100")
    }else if(myNumber2 >=  50){
        println("The number is greater than 50")
    }else{
        println("My number is greater than 0, but lower than 50")
    }

    //If podem ser utilizadas como statment exemplo:
    val text = if(myNumber>0){
        "greater than 0"
    }else {
        3
    }
    println(text)
}