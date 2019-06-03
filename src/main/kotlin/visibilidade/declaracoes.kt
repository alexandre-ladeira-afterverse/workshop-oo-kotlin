package Visibilidade

private fun umaFuncao() = "Uma funcao"

private class UmaClasse(val atributo: String) {

    fun printaAtributo() {
        println(this.atributo)
    }
}

open class ClasseA{
    private val a = 1
    protected val b = 2
    internal val c = 3
    val d = 4
}

class ClasseB() : ClasseA() {

     fun funcao() {
         //this.a
         this.b
         this.c
     }

}


fun main() {
    umaFuncao()
    val classe = UmaClasse("umAtributo")
    classe.atributo
    classe.printaAtributo()

    val classeA = ClasseA()
    classeA.c
}