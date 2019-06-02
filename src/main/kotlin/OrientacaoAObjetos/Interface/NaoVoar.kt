package OrientacaoAObjetos.Interface

class NaoVoar: ComportamenteDeVoo {
    override fun voar() {
        println("Não posso voar 😢")
    }
}