package solid.pato

// Head First Design Patterns: Chapter 1; The SimUDuck app
abstract class Pato(
    var comportamentoDeVoo: ComportamentoDeVoo) {

    fun nadar() {
        println("Todos os patos flutuam ")
    }

    fun performarVoo() {
        this.comportamentoDeVoo.voar()
    }

    abstract fun display()

}