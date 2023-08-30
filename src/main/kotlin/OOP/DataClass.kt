package OOP

fun main() {
    val name1: DataUser = DataUser("Gabriel", "Silva", 23)
    val name2: DataUser = DataUser("Gabriel", "Silva", 23)
    val name3: DataUser = DataUser("John", "Silva", 23)

    println(name1 == name2)
    println(name2.equals(name1))
    println(name2.equals(name3))
    println(name1.equals(name3))
    println(name1.toString())

}

class DataUser(var firstName: String, var lastName: String, var age: Int) {

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }
        if (other is DataUser) {
            return this.firstName == other.firstName
                    && this.lastName == other.lastName
                    && this.age == other.age
        }
        return false
    }

    override fun hashCode(): Int {
        return 0
    }

    override fun toString(): String {
        return "User(FirstName = '$firstName', LastName = '$lastName', Age = $age)"
    }
}