package avancado

fun <T> List<T>.filtrarComCondicao(condition: (T) -> Boolean): List<T> {
    val resultado = mutableListOf<T>()

    this.forEach {
        if (condition(it)){
            resultado.add(it)
        }
    }

    return resultado
}

fun ehMaiorQue10(numero: Int) = numero > 10

fun main() {
    val minhaLista = listOf(3, 4, 5, 10, 21, 44)
    val listaFiltrada = minhaLista.filtrarComCondicao { it > 10 }
    val listaFiltrada2 = minhaLista.filtrarComCondicao{ ehMaiorQue10(it) }

    println(listaFiltrada)

    val lambda = {x: Int, y: Int -> x + y}
    println(lambda(1, 1))

    val anonima = fun(x: Int, y: Int): Int { return x * y }
    println(anonima(4, 4))
}