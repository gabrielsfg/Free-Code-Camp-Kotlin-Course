package Collections

fun main(args: Array<String>){

    val user1 = User("Name 1")
    val user2 = User("Name 2")
    val user3 = User("Name 3")
    val user4 = User("Name 4")
    val user5 = User("Name 5")
    val user6 = User("Gabriel")
    val user7 = User("Gabriel")
    val users = setOf<User>(user1, user2, user3, user4, user5, user6, user7)
    users.forEach { println(it.name) }

    //Cannot have the same element 2 times
    val sets = setOf<String>("Name1", "Name2", "Name1")
    sets.forEach{ println(it) }

    val sets2 = mutableSetOf<String>("Name1", "Name2", "Name1")
    sets2.add("Name4")
    sets2.forEach{ println(it) }

}

data class User(val name: String)
//class User(val name: String)