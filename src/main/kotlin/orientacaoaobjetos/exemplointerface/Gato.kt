package orientacaoaobjetos.exemplointerface

class Gato: Animal {
    override fun fazerBarulho() {
        println("Miau 🐈")
    }

    override fun comer() {
        println("Comendo 🐟 ")
    }
}