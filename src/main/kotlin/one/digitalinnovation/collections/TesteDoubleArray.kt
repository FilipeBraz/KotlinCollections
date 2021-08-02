package one.digitalinnovation.collections

fun main() {
    val salarios = DoubleArray(3)

    salarios[0] = 1500.50
    salarios[1] = 1850.35
    salarios[2] = 1508.87

    salarios.forEach { println(it) }

    println("==========================================================")

    salarios.forEachIndexed { index, salario ->
        salarios[index] = salario * 1.15
    }
    salarios.forEach { println(it) }

    println("==========================================================")
    val salarios2 = doubleArrayOf(1500.50,1850.35,1508.87)

    salarios2.sort()
    salarios2.forEach { println(it) }
}