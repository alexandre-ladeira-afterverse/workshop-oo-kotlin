package excecoes

class Motorista(val nome: String, val idade: Int) {
    init {
        if (idade < 18) {
            throw Exception("O motorista deve ser maior de idade")
        }
    }

    fun dirigir() {
        println("${this.nome} está dirigindo")
    }
}