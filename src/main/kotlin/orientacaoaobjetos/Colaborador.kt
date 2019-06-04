package orientacaoaobjetos

// Mais sobre: https://kotlinlang.org/docs/reference/data-classes.html
data class Colaborador(
    val nome: String, // Essas são as propriedades da classe
    val cpf: String,  // Observe que o contrutor primário já está definido
    val dataDeNascimento: String?,
    val salario: Double? = 1000.00,
    var idade: Int?
) {

    init {
        if (salario != null && salario < 998)
            println("O salário é menor que o mínimo!")
    }

    companion object {
        val FORMATO_DO_CPF = "000.000.000-0" // constante
    }
}