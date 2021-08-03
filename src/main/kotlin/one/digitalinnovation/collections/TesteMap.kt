package one.digitalinnovation.collections

fun main() {
    val pair: Pair<String, Double> = Pair("Filipe", 1800.0)
    val map1 = mapOf(pair)

    map1.forEach { (k, v) -> println("Chave: $k - Valor: $v") }

    val map2 = mapOf(
        "Pedro" to 3600.0,
        "Maria" to 2500.0
        )

    map2.forEach { (k, v) -> println("Chave: $k - Valor: $v") }


}