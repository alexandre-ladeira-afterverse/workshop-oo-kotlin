package orientacaoaobjetos.exemplointerface

class PorquinhoDaIndia: Animal, Roedor {
    override fun fazerBarulho() {
       println("Porquinho 🔉")
    }

    override fun comer() {
       println("Comendo 🥬")
    }

    override fun roer() {
        println("Roendo 🐹")

    }
}