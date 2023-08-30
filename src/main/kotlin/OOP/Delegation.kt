package OOP

import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

fun main(){
    val userDelegate = UserDelegate()
    with(userDelegate) {
        firstName = "Gabriel"
        lastName = "Silva"
    }
    with(userDelegate){
        println(firstName)
        println(lastName)

    }

}

class App: A by FirstDelegate(), B by SecondDelegate(){
    override fun print() {
        TODO("Not yet implemented")
    }

    override fun print2() {
        TODO("Not yet implemented")
    }

}

interface A {
    fun print()
}

interface B {
    fun print2()
}

open class FirstDelegate: A {
    override fun print() {
        TODO("Not yet implemented")
    }
}

open class SecondDelegate: B {
    override fun print2() {
        TODO("Not yet implemented")
    }
}

//Delegation of variables
class UserDelegate {
    var firstName by FormatDelegate()
    var lastName by FormatDelegate()
}

class FormatDelegate: ReadWriteProperty<Any?, String> {
    private var formattedString: String = ""

    override fun getValue(thisRef: Any?, property: KProperty<*>): String {
        return formattedString
    }

    override fun setValue(thisRef: Any?, property: KProperty<*>, value: String) {
        formattedString = value.lowercase()
    }
}