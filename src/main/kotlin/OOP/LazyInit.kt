package OOP

fun main(){
    val user1 = Classe("Alex", "Smith", 19)
    val classe:Classe by lazy {
        Classe("Gabriel", "Silva", 23)
    }
//    println(classe.age)

}

class Classe(var firstName:String, var lastName:String, var age:Int){
    init{
        println("User $firstName was created")
    }

}