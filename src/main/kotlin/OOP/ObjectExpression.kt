package OOP

fun main(){


    val loginButton: LoginButton = LoginButton("Login", 10, object  : OnClickListener{
        override fun onClick() {
            //Code for when press the Login Button
        }
    })
    val signUpButton: LoginButton = LoginButton("Sign Up", 54, object : OnClickListener{
        override fun onClick() {
            //Code for whe press the Sign-Up Button
        }
    })
}

class LoginButton(val text:String, val id: Int, onClickListener: OnClickListener){

}

class ClickListener(): OnClickListener{
    override fun onClick() {

    }
}

interface OnClickListener{
    fun onClick()
}