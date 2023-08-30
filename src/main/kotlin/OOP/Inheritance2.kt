package OOP

fun main(){
    val view:View = View()
    val button:Button = Button("Create Account", "Center")
    val roundButton: RoundButton = RoundButton("Deposit", "Center", 15)

    view.draw()
    button.draw()
    roundButton.draw()




}

open class View(){
    open fun draw(){
        println("Drawing the view\n")
    }
}

open class Button(val text:String, val orientation: String): View(){

    override fun draw() {
        println("Drawing the button")
        super.draw()
    }
}

class RoundButton(text: String, orientation: String, val corners: Int): Button(text, orientation){

    override fun draw() {
        println("Drawing the round button")
        super.draw()
    }
}

