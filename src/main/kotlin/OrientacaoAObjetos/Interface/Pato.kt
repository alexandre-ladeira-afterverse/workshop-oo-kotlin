package OrientacaoAObjetos.Interface

// Head First Design Patterns: Chapter 1; The SimUDuck app
abstract class Pato(
    var comportamenteDeVoo: ComportamenteDeVoo) {

    fun nadar() {
        println("Todos os patos flutuam ")
    }

    fun performarVoo() {
        this.comportamenteDeVoo.voar()
    }

    abstract fun display()

}