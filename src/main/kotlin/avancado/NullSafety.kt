package avancado

// Mais sobre: https://kotlinlang.org/docs/reference/null-safety.html

fun estadoComPais(estado: Estado): String {
    return "O estado é ${estado.nome} que está no pais de codigo ${estado.pais?.codigo}"

}

fun colecoesNulaveis() {
    val listaNulavel = listOf(1, 2, null, 3, 4)
    println(listaNulavel)
    val listaNaoNulavel = listaNulavel.filterNotNull()
    println(listaNaoNulavel)
}

fun elvisOperator(nome: String?): String {
    val nomeEmMaiscula = nome?.toUpperCase()

    val mensagem = nomeEmMaiscula ?: "NOME NÃO FORNECIDO!"

    return mensagem

}

fun main() {
//    val brasil = Pais("BR")
//    val saoPaulo = Estado("São Paulo", brasil)
//
//    println(estadoComPais(saoPaulo))
    colecoesNulaveis()

    println(elvisOperator("Alexandre"))


}