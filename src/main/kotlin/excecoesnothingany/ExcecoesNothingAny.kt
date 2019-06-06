package excecoesnothingany

// Mais sobre: https://kotlinlang.org/docs/reference/exceptions.html
class MinhaException(mensagem: String): Exception(mensagem)

fun minhaFuncao(a: Int) {
    when(a) {
        0 -> throw Exception("Exceção em 0")
        1 -> throw MinhaException("Minha exceção lançada")
        else -> throw  IllegalArgumentException("Essa opção não existe")
    }
}

fun lancaExcecao(): Nothing {
    throw Exception("Isso é uma exception!")
}

fun tiposComoObjetos() {
    val tamanho = "Sou uma String".length
    val dois = 1

    println(dois)
}


fun main() {
//    try {
//        val motorista = Motorista("Joao", 17) // Essa chamada lança uma excecao
//    } catch (e: Exception) {
//        // aqui nós tratamos a excecao
//        println("O motorista não pode dirigir!")
//    }

    try {
        minhaFuncao(1)
    } catch (e: MinhaException) {
        println(e)
    } catch (e: Exception) {
        println(e)
    } finally {
        println("Finalmente :D")
    }

    tiposComoObjetos()




}