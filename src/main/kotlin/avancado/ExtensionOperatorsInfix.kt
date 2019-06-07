package avancado

//https://kotlinlang.org/docs/reference/extensions.html
fun String.removerUltimoCaracter(): String =  this.substring(0, this.length - 1)
fun Pessoa.ehMaiordeIdade() = this.idade >= 18

//https://kotlinlang.org/docs/reference/operator-overloading.html
operator fun Pessoa.plus(outra: Pessoa) = Pessoa(
        "${this.nome} e ${outra.nome}",
        this.idade + outra.idade,
        null)



fun main() {
    val nome = "Alexandre"
    println(nome.removerUltimoCaracter())

    val ale = Pessoa("Alexandre", 18, "Programador")
    println(ale.ehMaiordeIdade())

    val joao = Pessoa("João", 20)
    println(ale + joao)

    val umCopo = Copo(200)
    umCopo add 100

    println(umCopo)

}