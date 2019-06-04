package orientacaoaobjetos.heranca

open class Produto(marca: String, preco: Double) {
    val marca: String = marca
    var preco: Double = preco
        private set

    fun oscilarPreco(oscilacao: Double) {
        this.preco += oscilacao
    }

}