package solid.pato

fun criarPato(opcao: Int): Pato {
    return if (opcao == 1) {
        PatoReal()
    } else
        PatoDeBorracha()
}

fun main() {
    val pato = criarPato(1)
    pato.display()

    pato.performarVoo()
    pato.comportamenteDeVoo = NaoVoar()
    pato.performarVoo()

    pato.nadar()


}