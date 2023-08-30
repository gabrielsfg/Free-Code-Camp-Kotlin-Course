package Loops

fun main(){
    var number = 0

    while(number < 5) {
        number++
        println(number)

        var i = 0

        while (i<3){
            i++
            println("***$i")
        }
    }

    while (number < 13) println(number++)

    do {
        println(number)
    } while (number < 10)


    var cont = 0
    while (cont < 10){
        cont++
        if (cont > 2 && cont <8){
            continue //Volta para o inicio do loop
        }
        if (cont == 9){
            break //Acaba com o Loop
        }
        println(cont)
    }
}
