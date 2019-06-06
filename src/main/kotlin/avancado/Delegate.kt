package avancado

interface Base {
    fun printMessage()
    fun printMessageLine()
}

class BaseImpl(val x: Int) : Base {
    override fun printMessage() { print(x) }
    override fun printMessageLine() { println(x) }
}

class Derived(b: Base) : Base by b {
    override fun printMessage() { println("abc") }
}

class ExemploLazy {
    val valorLazy by lazy {
        println("Computado")
        "Valor"
    }
}

fun main() {
    val b = BaseImpl(10)
    Derived(b).printMessage()
    Derived(b).printMessageLine()

    val meuExemploLazy = ExemploLazy()
    println(meuExemploLazy.valorLazy)
}