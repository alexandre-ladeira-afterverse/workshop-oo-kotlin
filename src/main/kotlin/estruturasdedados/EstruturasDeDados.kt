package estruturasdedados

import sun.misc.Queue
import java.util.*

// Mais sobre: https://kotlinlang.org/docs/reference/collections-overview.html

/**
 * stores elements in a specified order and provides indexed access to them.
 * Indices start from zero – the index of the first element – and go to lastIndex which is the (list.size - 1).
 * Two lists are considered equal if they have the same sizes and structurally equal elements at the same positions.
* */
fun lista(): List<String>{
    val numeros = listOf<Int>(1, 2, 3, 4, 5)
    val listaMutavel = mutableListOf<String>("Playkids App", "Leiturinha", "Explorer")


    println("Numero de elementos = ${listaMutavel.size}")
    println("Elemento na posição 1 = ${listaMutavel[1]}")
    println("Indice de Explorer = ${listaMutavel.indexOf("Explorer")}")

    listaMutavel.add("Crafty Lands")
    println(listaMutavel)

    listaMutavel.sort()

    println(listaMutavel)

    return listaMutavel

}

/**stores unique elements; their order is generally undefined. null elements are unique as well:
 * a Set can contain only one null. Two sets are equal if they have the same size, and for each
 * element of a set there is an equal element in the other set.
 * */
fun conjunto(){
    val numeros = setOf(1, 2, 3, 4)
    println("Numero de elementos: ${numeros.size}")
    if (numeros.contains(1)) println("1 está no conjunto")

    val numerosAoContrario = setOf(4, 3, 2, 1)
    println("Os conjuntos são iguais: ${numeros == numerosAoContrario}")

    val carros = mutableSetOf(
        Carro("Azul", 2),
        Carro("Vermelho", 4)
    )

    carros.add(Carro("Preto", 3))

    println(carros.first().cor)
    carros.remove(Carro("Azul", 2))

    println(carros)
}

/** A Map stores key-value pairs (or entries); keys are unique, but different keys can be paired with equal values.
 * The Map interface provides specific functions, such as access to value by key, searching keys and values, and so on.
 * Two maps containing the equal pairs are equal regardless of the pair order.
 * */
fun dicionario() {
    val pessoas = mutableMapOf("Alexandre" to 18, "Pedro" to 19, "Lucas" to 18)
    println("Chaves ${pessoas.keys}")
    println("Valores ${pessoas.values}")
    println("Map $pessoas")

    val pessoas2 = mutableMapOf("Pedro" to 19, "Lucas" to 18, "Alexandre" to 18)

    if (pessoas == pessoas2) println("São iguais")

    pessoas.put("José", 20)
    println("${pessoas["Alexandre"]}")
}

/**
 * https://www.devmedia.com.br/classes-stack-queue-e-hashtable-colecoes-estrutura-da-linguagem-parte-3/19256
 */

fun fila(){
    val fila = LinkedList<String>()

    fila.add("Alexandre")
    fila.add("Matheus")
    fila.add("Lucas")

    val primeiroDaFila = fila.peekFirst()
    println(primeiroDaFila)

    println(fila.pop())

    println(fila.peekFirst())
}

fun pilha(){
    val pilha = Stack<Int>()

    pilha.push(1)
    pilha.push(2)
    pilha.push(3)

    println("Primeiro da pilha ${pilha.peek()}")

    val primeiroASair = pilha.pop()
    println(primeiroASair)

}

/**
 * https://github.com/eugenp/tutorials/tree/master/core-kotlin/src/main/kotlin/com/baeldung/datastructures
 * */
fun arvore(){
    val tree = Node(10)
    val numeros = listOf(5,12,15,3)
    for (numero in numeros) {
        tree.insert(numero)
    }
    val node = tree.find(10)!!

    println("Nó com valor ${node.key} [esquerda = ${node.left?.key}, direita = ${node.right?.key}]")
    println("Deletando nó com valor = 3")
}

fun main(){
    //val listaRetornada = lista() // Não podermos modificar a lisque que foi retornada
    //conjunto()
    //dicionario()
    //fila()
    arvore()


}