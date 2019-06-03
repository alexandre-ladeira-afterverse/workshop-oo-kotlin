package Excecoes

fun main() {
    try {
        val motorista = Motorista("Joao", 17) // Essa chamada lança uma excecao
    } catch (e: Exception) {
        // aqui nós tratamos a excecao
        println("O motorista não pode dirigir!")
    }

}