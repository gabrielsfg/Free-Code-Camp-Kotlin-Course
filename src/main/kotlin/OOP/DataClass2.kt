package OOP

fun main() {
    val name1: DataUser2 = DataUser2("Gabriel", "Silva", 23)
    val name2: DataUser2 = DataUser2("Gabriel", "Silva", 23)
    val name3: DataUser2 = DataUser2("John", "Silva", 23)

    println(name1 == name2)
    println(name2.equals(name1))
    println(name2.equals(name3))
    println(name1.equals(name3))
    println(name1.toString())


}

data class DataUser2(var firstName: String, var lastName: String, var age: Int)