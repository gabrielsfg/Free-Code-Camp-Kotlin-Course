package OOP

    fun main(){
        val user2: User2 = User2("Gabriel",)
        val friend2: User2 = User2("Alex", "Smith")

        println("User2 name: ${user2.name} \nUser2 LastName: ${user2.lastName} \nUser2 age: ${user2.age}")
        println("Friend2 name: ${friend2.name} \nFriend2 LastName: ${friend2.lastName} \nFriend2 age: ${friend2.age}")
    }


    class User2(var name:String, var lastName:String, var age:Int){

        constructor(name:String): this(name, "LastName", 0){
            println("2nd")
        }
        constructor(name:String, lastName: String): this(name, lastName, 0){
            println("3rd")
        }

    }
