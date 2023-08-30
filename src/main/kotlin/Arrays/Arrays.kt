package Arrays

fun main(){
    val names: Array<String> = arrayOf("Joao", "Maria", "Pedro")
    println(names[0])

    names[0] = "Alex"
    println(names[0])
    println("The size of the array is ${names.size}")

    val infos = arrayOf(3, 5, 6, 8, "Nome 1", 'a')
    println(infos[4])
    println("The size of the array is ${infos.size}")

    for (i in names){
        println(i)
    }

    for (i in infos){
        if (i is Int){
            println(i)
        }
    }
}