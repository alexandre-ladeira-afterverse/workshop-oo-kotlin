package excecoes

// Mais sobre: https://kotlinlang.org/docs/reference/exceptions.html
class MinhaException(mensagem: String): Exception(mensagem)

fun minhaFuncao(a: Int) {
    when(a) {
        0 -> throw Exception("Exceção em 0")
        1 -> throw MinhaException("Minha exceção lançada")
    }
}


fun main() {
   /* try {
        val motorista = Motorista("Joao", 17) // Essa chamada lança uma excecao
    } catch (e: Exception) {
        // aqui nós tratamos a excecao
        println("O motorista não pode dirigir!")
    }*/


    try {
        minhaFuncao(1)
    } catch (e: MinhaException) {
        println(e)
    } catch (e: Exception) {
        println(e)
    } finally {
        println("Finalmente :D")
    }


}