package Functions

fun main(){
    println(sum(5,6,7,10,5,10,5))
    each(1,6,4,2,1,5,7,8,9)

}
/*
    Vararg Permite vc criar uma funcao com uma quantidade nao definidas de parametros, use o for para fazer calculos com esses valores
 */
fun sum(vararg numbers:Int):Int {
    var result = 0
    for(i in numbers){
        result += i
    }
    return result
}

fun each(vararg numbers: Int){
    numbers.forEach { println(it) }
}