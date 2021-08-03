package one.digitalinnovation.collections

fun main() {
    val filipe = Funcionario("Filipe", 2500.00)
    val maria = Funcionario("Maria", 2000.00)
    val carlos = Funcionario("Carlos", 1600.00)

    val funcionarios = listOf(filipe, maria, carlos)

    funcionarios.forEach{println(it)}
    println("==========================================================")

    println(funcionarios.find {it.nome == "Maria"})
}

data class Funcionario(
    val nome: String,
    val salario: Double
){
    override fun toString(): String =
            """
                Nome: $nome
                Salario: $salario
                
            """.trimIndent()



}