package OOP

fun main() {
    println(Database)
    println(Database)
    println(Database)
}

//class Database private constructor() {
//    companion object {
//        private var instance: Database? = null
//
//        fun getInstance(): Database? {
//            if (instance == null) {
//                instance = Database()
//            }
//            return instance
//        }
//    }
//}

object Database {
    init {
        println("DataBase Created")
    }

}
