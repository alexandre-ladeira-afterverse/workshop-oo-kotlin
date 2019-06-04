import orientacaoaobjetos.heranca.Celular
import orientacaoaobjetos.heranca.Livro
import orientacaoaobjetos.heranca.Produto

fun exemploDePolimorfismo(produto: Produto) {
    println("O produto da marca ${produto.marca} tem preço ${produto.preco}")
}

fun main() {
    val meuLivro = Livro("minha editora", 30.25, 50)
    val meuCelular = Celular("Apple", 4000.00, "BZZZBZZZBZZ")

    meuLivro.trocarDePagina()
    meuLivro.oscilarPreco(2.00)

    meuCelular.tocar()
    meuCelular.oscilarPreco(100.00)

    println(meuCelular.preco)

    exemploDePolimorfismo(meuLivro)
}