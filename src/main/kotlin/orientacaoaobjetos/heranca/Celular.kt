package OrientacaoAObjetos.Heranca

class Celular(
    fabricante: String,
    preco: Double,
    val toque: String): Produto(fabricante, preco) {

    fun tocar() {
        println("O telefone está tocando $toque")
    }
}