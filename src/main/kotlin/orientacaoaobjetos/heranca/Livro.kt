package orientacaoaobjetos.heranca

class Livro(
    editora: String,
    preco: Double,
    val numeroDePaginas: Int
): Produto(editora, preco) {

    fun trocarDePagina() {
        println("Trocando de pagina")
    }
}
