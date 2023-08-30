package Operators

fun main(){
    var x = 5
    val y = 3
    val z = 3f

    var result = x + y // X e Y sao OPERANDS pois sao afetados pelo operador +
    println("result = $result")

    //Outra forma
    println("x + y = ${x + y}")
    println("x - y = ${x - y}")
    println("x * y = ${x * y}")
    println("x / y = ${x / y}")
    println("x / z = ${x / z}") // Com valor quebrado
    println("x % y = ${x % y}")

    result += 2 // result = result + 2
    println("result + 2 = $result")

    result -= 2 // result = result - 2
    println("result - 2 = $result")

    result *= 2 // result = result * 2
    println("result * 2 = $result")

    result /= 2 // result = result / 2
    println("result / 2 = $result")

    result %= 2 // result = result % 2
    println("result % 2 = $result")

    println("3 + 3 * 4 = ${3 + 3 * 4}")
    println("(3 + 3) * 4 = ${(3 + 3) * 4}")

    var cont = 0
    println("cont++ = ${cont++}") //Adiciona 1 apos o print
    println("++cont = ${++cont}") //Adiciona 1 e depois print

    println("cont-- = ${cont--}") //Retira 1 apos o print
    println("--cont = ${--cont}") //Retira 1 e depois print

    /*Existem tambem os operadores de comparacoes, usados normalmente para retornar booleans em ControlFlow
        <,
        >,
        <=,
        >=
     */

    /*
    Operadores logicos:
        &&,  --> Operador "E"
        ||,  --> Operador "OU"
        !    --> Operador "NAO"
     */
}