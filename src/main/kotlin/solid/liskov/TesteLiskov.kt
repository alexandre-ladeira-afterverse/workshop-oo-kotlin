package solid.liskov

fun codigoDoCliente(patos: List<Pato>) {
    patos.forEach {
        it.voar()
    }
}

fun main() {
    val patoDeBorracha = PatoDeBorracha()
    val patoReal = PatoReal()

    val meusPatos = listOf(patoDeBorracha, patoReal)

    codigoDoCliente(meusPatos)




}