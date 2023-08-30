package Functions

fun main(){
    sendMessage("Gabriel")
    sendMessage(message="Hello!")

}

fun sendMessage(name:String = "Default Name", message: String = "Default Message"){
    println("Name = $name \nmessage = $message")
}