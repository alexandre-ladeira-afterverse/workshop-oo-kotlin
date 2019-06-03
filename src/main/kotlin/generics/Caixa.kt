package generics

// Mais sobre: https://kotlinlang.org/docs/reference/generics.html
class Caixa<T>() {
    val lista = mutableListOf<T>()

    fun armazenar(item: T) {
        lista.add(item)
    }

    fun retornaPrimeiro(): T {
        return lista.first()
    }
}

fun  main(){
    val minhaCaixa = Caixa<String>()

    minhaCaixa.armazenar("Sapato")

    println("O primeiro dentro da caixa é ${minhaCaixa.retornaPrimeiro()}")
}