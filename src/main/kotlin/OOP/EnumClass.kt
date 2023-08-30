package OOP

fun main(){
    println(Direction.NORTH.distance)
    println(Direction.SOUTH.direction)
    println(Direction.EAST.name)
    println(Direction.WEST)
    println("\n")

    for(direction in Direction.values()){
        println(direction)
        println(direction.direction)
        println(direction.distance)
        direction.printData()
        println("\n")
    }

    val direction = Direction.valueOf("NORTH")
    when(direction){
        Direction.EAST -> println("The direction is EAST")
        Direction.WEST -> println("The direction is WEST")
        Direction.NORTH -> println("The direction is NORTH")
        Direction.SOUTH -> println("The direction is SOUTH")
    }
}

enum class Direction(var direction: String, var distance: Int){
    NORTH("North", 10),
    SOUTH("South", 20),
    EAST("East", 15),
    WEST("West", 40);

    fun printData(){
        println("Direction = $direction and Distance = $distance")
    }
}
