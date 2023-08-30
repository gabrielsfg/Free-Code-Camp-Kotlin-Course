package Collections

fun main(){
    val maps = mapOf<Int, String>(1 to "Maria", 2 to "Joao", 3 to "Pedro")

    println(maps[1])
    println(maps[3])
    println(maps[2])
    
    val maps2 = mutableMapOf<Int, String>(1 to "Gabriel", 2 to "Julia", 3 to "Marcos")
    maps2[5] = "Alexandre"
    maps2.remove(3)
    maps2.forEach { (t, u) ->
        println("$t to $u")
    }
}