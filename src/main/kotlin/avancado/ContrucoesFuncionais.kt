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

fun iteracaoComForEach() {
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
            //Posso desenvolver a logica que quiser usando pessoa.
            //a ultima linha é o retorno
            println("${pessoa.nome} é $profissao")
        }
    }



}



fun usandoAlso(nick: String, email: String): Usuario {
    return Usuario(nick, email).also {
        println("Usuário criado com o nick ${it.nick}")
    }
}

fun encademaento() {

}

data class Usuario(val nick: String, val email: String)

fun usandoAssociate() {
    val usuarios = listOf(
        Usuario("ale", "ale@email.com"),
        Usuario("xu", "xuxu@email.com"),
        Usuario( "drica", "dridri@gmail.com")
    )

    val mapeadosBy = usuarios.associateBy { it.nick  }
    val mapeados = usuarios.associate { it.nick to it.email }

    println(mapeadosBy)
    println(mapeados)
}

fun usandoGroupBy() {
    val letras = listOf("a", "abc", "ab", "def", "abcd")
    val agrupadasPorTamanho = letras.groupBy { it.length }

    println("Tamnhos: ${agrupadasPorTamanho.keys}")
    println("Valores: ${agrupadasPorTamanho.values}")
    println("Grupos de letras: $agrupadasPorTamanho")

    val listDeColaboradores = listOf(
        "Alexandre" to "Plataformas",
        "Igor" to "Faster",
        "Adriano" to "Plataformas",
        "Flavio" to "BI",
        "Robson" to "BI",
        "Gui" to "Faster",
        "Julin" to "Plataformas"
    )

    println(listDeColaboradores)

    val nomesPorTime = listDeColaboradores.groupBy({it.second}, {it.first})
    println(nomesPorTime)

}

fun encadeamento() {
    val cores = listOf("azul", "preto", "verde", "amarelo", "vermelho", "roxo")

    val coresFiltradas = cores.filter { it.startsWith("a") }
        .sortedBy { it }
        .map { it.toUpperCase() }
        .forEach{ println("Cor: $it")}
}

fun main(){
    //filtro()
    //iteracaoComForEach()
    //usandoMap()
    //usandoFold()
    //usandoReduce()
    //usandoLet()
    //usandoAssociate()
    //usandoGroupBy()
    //println(usandoAlso("Alexandre", "alexandre.ladeira@playkids.com"))
    encadeamento()

}