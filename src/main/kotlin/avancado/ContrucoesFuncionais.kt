package avancado

fun filtro() {
    val pessoas = listOf(
        Pessoa("Pedro", 15),
        Pessoa("João", 19),
        Pessoa("Matheus", 17),
        Pessoa("Ana", 21)
    )

    val maioresDeIdade = pessoas.filter { it.idade >= 18 }

    println("Todas as pessoas $pessoas")
    println("Maiores de idade $maioresDeIdade")
}

fun iteracao() {
    val numeros = setOf(5, 8, 20, 44, 13)

    numeros.forEach {numero ->
        println(numero * numero)
    }
}

fun usandoMap() {
    val cores = listOf("Azul", "Amarelo", "Vermelho", "Verde")

    val frases = cores.map {
        "A cor é: $it"
    }

    println(frases)
}

fun usandoFold() {
    val numeros = listOf(1, 2, 3)

    val soma = numeros.fold(0) { soma, numero -> soma + numero }

    println(soma)
}

fun usandoReduce() {

    val numeros = listOf(1, 2, 3)

    val soma = numeros.reduce { soma, numero -> soma + numero }

    println(soma)

}

fun usandoLet() {
    val pessoas = listOf(
        Pessoa("Pedro", 15, "Motorista"),
        Pessoa("João", 19),
        Pessoa("Matheus", 17, "Carpinteiro"),
        Pessoa("Ana", 21, "Programadora")
    )

    pessoas.forEach { pessoa ->
        pessoa.profissao?.let { profissao ->
            println("${pessoa.nome} é $profissao")
        }
    }
}

fun main(){
    //filtro()
    //iteracao()
    //usandoMap()
    //usandoFold()
    //usandoReduce()
    //usandoLet()

}