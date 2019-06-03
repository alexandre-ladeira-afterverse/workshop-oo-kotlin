package sealedclasses

sealed class Result {
    class Success(val items: List<String>): Result()
    class Failure(val error: Throwable): Result()
}

fun main(){
    val items = listOf("Correto1", "Correto2")
    val resultado = Result.Success(items) as Result

    when (resultado) {
        is Result.Success -> println(resultado.items)
        is Result.Failure -> resultado.error.printStackTrace()
    }
}