package Avancado

data class Copo (
    var quantidade: Int = 0
) {
    infix fun add (quantidade: Int){
        this.quantidade += quantidade
    }
}