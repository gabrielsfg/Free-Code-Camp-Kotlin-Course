package Variables

fun main(){
    val number: Int = 20
    val maxIntegerValue: Int = Int.MAX_VALUE
    val minIntegerValue: Int = Int.MIN_VALUE
    println("Int Maximum Value is: $maxIntegerValue")
    println("Int Minimum value is: $minIntegerValue")
    println(number)

    val myMaxByteValue: Byte = Byte.MAX_VALUE
    val myMinByteValue: Byte = Byte.MIN_VALUE
    println("Byte Maximum Value is: $myMaxByteValue")
    println("Byte Minimum value is: $myMinByteValue")

    val myMaxShortValue: Short = Short.MAX_VALUE
    val myMinShortValue: Short = Short.MIN_VALUE
    println("Short Maximum Value is: $myMaxShortValue")
    println("Short Minimum value is: $myMinShortValue")

    val myMaxLongValue: Long = Long.MAX_VALUE
    val myMinLongValue: Long = Long.MIN_VALUE
    println("Long Maximum Value is: $myMaxLongValue")
    println("Long Minimum value is: $myMinLongValue")

    val myNumber = 28L // Faz ser um long
    val myLong = 2888888888 // Long
}