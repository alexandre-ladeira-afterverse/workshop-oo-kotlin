package orientacaoaobjetos.Interface

class PatoDeBorracha: Pato(NaoVoar()) {
    override fun display() {
        println("É um pato de borracha 🐥")
    }
}