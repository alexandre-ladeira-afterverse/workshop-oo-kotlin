package sealedclasses

//https://kotlinlang.org/docs/reference/sealed-classes.html
sealed class Result {
    class Success(val items: List<String>): Result()
    class Failure(val error: Throwable): Result()
}

fun main(){
    val items = listOf("Correto1", "Correto2")
    val sucesso = Result.Success(items)
    val erro = Result.Failure(IllegalArgumentException("Deu erro aqui"))


    tratarResultado(sucesso)
}

fun tratarResultado(resultado: Result) {
    when (resultado) {
        is Result.Success -> println("Resultados positivos: ${resultado.items}")
        is Result.Failure -> resultado.error.printStackTrace()
    }
}