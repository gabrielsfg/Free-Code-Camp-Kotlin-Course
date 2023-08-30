package OOP

fun main(){
    val person1: Person = Person()
    println(person1.firstName)
    println(person1.lastName)
    println(person1.age)

    val person2: Person = Person(firstName = "John", age = 10)
    println(person2.firstName)
    println(person2.lastName)
    println(person2.age)
}

class Person(var firstName:String = "FirstName", var lastName:String = "LastName", var age:Int = 0){

}