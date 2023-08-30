package Collections

fun main() {
    val numbers = mutableListOf<Int>(6, 10, 14, 5, 100, 50, 23)
    numbers.sorted().forEach { println(it) }

    val laptops = mutableListOf<Laptop>(
        Laptop("Dell", 2014, 4, 600),
        Laptop("Acer", 2022, 16, 2000),
        Laptop("Samsung", 2023, 8, 1500)
    )

    //using sortedBy
    println("USING SORTEDBY")
    laptops.sortedBy { it.price }.forEach { println(it) }
    println("\n")

    laptops.sortedBy { it.brand }.forEach { println(it) }
    println("\n")

    laptops.sortedBy { it.year }.forEach { println(it) }
    println("\n")

    laptops.sortedBy { it.ram }.forEach { println(it) }
    println("\n")

    //Using sortedWith:
    println("USING SORTEDWITH")
    laptops.sortedWith(compareBy {it.price}).forEach { println(it) }
    println("\n")

    laptops.sortedWith(compareBy {it.ram}).forEach { println(it) }
    println("\n")

    laptops.sortedWith(compareBy {it.year}).forEach { println(it) }
    println("\n")


    //Using the class we created
    println("USING THE CLASS WE CREATED")
    laptops.sorted().forEach { println(it) }
    println("\n")

    laptops.sortedWith(ComparatorRam()).forEach { println(it) }
    println("\n")

    laptops.sortedWith(ComparatorYear()).forEach { println(it) }
    println("\n")

}

data class Laptop(val brand: String, val year: Int, val ram: Int, val price: Int) : Comparable<Laptop> {
    override fun compareTo(other: Laptop): Int {
        return if (this.price > other.price) {
            println("In if1 statement: Swapping ${this.brand} with ${other.brand}")
            1
        } else if (this.price < other.price) {
            println("In if2 statement: Swapping ${this.brand} with ${other.brand}")
            -1
        } else {
            0
        }
    }
}


class ComparatorRam : Comparator<Laptop> {
    override fun compare(laptop1: Laptop, laptop2: Laptop): Int {
        return if (laptop1.ram > laptop2.ram) {
            return 1
        } else if (laptop1.ram < laptop2.ram) {
            return -1
        } else {
            return 0
        }
    }
}

class ComparatorYear: Comparator<Laptop> {
    override fun compare(laptop1: Laptop, laptop2: Laptop): Int {
        return if (laptop1.year > laptop2.year) {
            return 1
        } else if (laptop1.year < laptop2.year) {
            return -1
        } else {
            return 0
        }
    }
}