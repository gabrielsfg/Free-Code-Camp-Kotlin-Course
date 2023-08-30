package Functions

fun main(){
    sayHello()
    sum(10, 5)
    showMessage("Gabriel", 23)


}

fun sayHello(){
    println("Hello")
}

fun sum(a:Int, b:Int) {
    var number: Int = a
    println(a + b)
    println(number)
}

fun showMessage(name: String, age: Int){
    println("Hello $name your age is $age")

}
