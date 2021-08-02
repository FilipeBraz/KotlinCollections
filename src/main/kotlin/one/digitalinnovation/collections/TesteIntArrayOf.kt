package one.digitalinnovation.collections

fun main() {
    val values = intArrayOf(2, 5, 10, 6, 15, 100, 1)

    values.forEach{
        println(it)
    }

        println("=====================================")
    values.sort()
    values.forEach{
        println(it)
    }
}