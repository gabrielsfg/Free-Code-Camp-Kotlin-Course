package Collections

fun main(){
    val names = listOf<String>("Name 1", "Name 2", "Name 3")
    println(names[1])

    val names2 = mutableListOf("Name1", "Name2", "Name3")
    names2.add("Name4")
    names2.removeAt(0)
    names2.remove("Name3")

    names2.forEach{ println(it) }
}