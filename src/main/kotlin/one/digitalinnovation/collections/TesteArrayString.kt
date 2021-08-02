package one.digitalinnovation.collections

fun main() {
    val nomes = Array(4) {""}

    nomes[0] = "Filipe"
    nomes[1] = "Carlos"
    nomes[2] = "José"
    nomes[3] = "Abner"

    for (nome in nomes) {
        println(nome)
    }
    
    println("==========================================================")
    
    nomes.sort()
    nomes.forEach { println(it) }

    val nomes2 = arrayOf("Maria", "Zazá", "Filipe")

    println("==========================================================")

    nomes2.sort()
    nomes2.forEach { println(it) }

}