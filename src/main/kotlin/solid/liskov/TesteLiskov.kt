package solid.liskov

fun codigoDoCliente(pato: Pato) {
    pato.voar()
}

fun main() {
    val patoDeBorracha = PatoDeBorracha()
    val patoReal = PatoReal()

    codigoDoCliente(patoDeBorracha)




}