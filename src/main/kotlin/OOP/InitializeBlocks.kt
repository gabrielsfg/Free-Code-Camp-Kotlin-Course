package OOP

fun main(){
    val user: User = User("Gabriel", "Silva", 23)
    val friend: User = User("Alex", "Smith", 30)

    println("Name: ${user.name}")
    println("Name: ${friend.name}")
}


class User(name:String, var lastName:String, var age:Int){
    var name:String

    init {
        if (name.lowercase().startsWith("a")){
            this.name = name //This is used to refer to the property "name" of the class
            println("The name starts with the letter 'a' or 'A'")
        }else {
            this.name = "User"
            println("The name doesn't star with the letter 'a' or 'A' ")
        }
    }

}