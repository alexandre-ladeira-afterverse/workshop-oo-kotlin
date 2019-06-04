package orientacaoaobjetos.exemplointerface

fun comerEFazerBarulho(animal: Animal) {
    animal.comer()
    animal.fazerBarulho()

}

fun main() {

    val porquinhoDaIndia = PorquinhoDaIndia()
    val gato = Gato()

    comerEFazerBarulho(gato)
}