package visibilidade

private fun umaFuncao() = "Uma funcao"

private class UmaClasse(val atributo: String) {

    internal fun printaAtributo() {
        println(this.atributo)
    }
}

open class ClasseA {
    private val a = 1
    protected val b = 2
    internal val c = 3
    val d = 4

    fun minhaFuncao(){

    }
}

class ClasseB : ClasseA() {

     internal fun funcao() {
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

    val classeB = ClasseB()

    classeB.funcao()
}