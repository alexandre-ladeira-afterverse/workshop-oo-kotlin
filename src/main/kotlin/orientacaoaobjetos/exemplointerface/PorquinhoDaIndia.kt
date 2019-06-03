package orientacaoaobjetos.exemplointerface

class PorquinhoDaIndia: Animal, Roedor {
    override fun fazerBarulho() {
       println("🔉")
    }

    override fun comer() {
       println("Comendo 🥬")
    }

    override fun roer() {
        println("Roendo 🐹")

    }
}