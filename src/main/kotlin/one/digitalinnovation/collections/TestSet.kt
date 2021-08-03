package one.digitalinnovation.collections

fun main() {
    val filipe = Funcionario("Filipe", 2500.00, "CLT")
    val maria = Funcionario("Maria", 2800.00, "PJ")
    val carlos = Funcionario("Carlos", 1600.00, "CLT")

    val funcionarios1 = setOf(filipe, maria)
    val funcionarios2 = setOf(carlos)

    val resultUnion = funcionarios1.union(funcionarios2)
    resultUnion.forEach{println(it)}

    println("==========================================================")
    val funcionarios3 = setOf(filipe, maria, carlos)

    val resultSubtract = funcionarios3.subtract(funcionarios2)
    resultSubtract.forEach{println(it)}
    println("==========================================================")
    val resultIntercept = funcionarios3.intersect(funcionarios2)
    resultIntercept.forEach{println(it)}

}