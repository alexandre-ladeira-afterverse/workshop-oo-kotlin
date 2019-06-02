package OrientacaoAObjetos

import java.time.Instant

// Mais sobre: https://kotlinlang.org/docs/reference/data-classes.html
data class Colaborador(
    val nome: String,
    val cpf: String,
    val dataDeNascimento: String?,
    val salario: Double? = 1000.00,
    var idade: Int?) {

    init {
        if (salario != null && salario < 998)
            println("O salário é menor que o mínimo!")
    }

    companion object {
        val FORMATO_DO_CPF = "000.000.000-0"
    }
}