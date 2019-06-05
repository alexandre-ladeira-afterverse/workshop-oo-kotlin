package sintaxe

fun main() {
//    var mutavel: String = "Posso mudar"
//    val imutavel: String = "Não posso mudar"
//
//    println(mutavel)
//    println(imutavel)
//
//    mutavel = "Mudei!"
//    println(mutavel)

    //println(sintaxe.soma(1 + 1))
    //sintaxe.comandosBasicos(100)
    //sintaxe.testandoRanges()
    //sintaxe.tiposNull("Alexandre")
    //tiposEnumerados()
}

fun tiposEmKotlin(){
    val a: Int = 10000
    val d: Double = 100.00
    val f: Float = 100.00f
    val l: Long = 1000000004
    val s: Short = 10
    val b: Byte = 1

    val letra = 'A'
    val palavra = "Alexandre"
    //val teste = 'Errado'


}

fun soma(a: Int, b: Int) = a + b


fun multiplicacao(a: Int, b: Int): Int {
    return a * b
}

fun comandosBasicos(numero: Int) {

    if(numero > 42) {
        println("O numero $numero é maior que 42")
    }
    else if (numero > 42 && numero < 100) { // ||
        println("O numero $numero é menor que 42 e menor que 100")
    }


    if (numero > 42) print("👍Maior que 42") else print("Menor que 42👎")

    when (numero) {
        100 -> print("numero == 100")
        101 -> print("numero == 101")
        else -> {
            print("Nem 100 nem 101")
        }
    }

    var contador = 0

    while (contador < 10) {
        contador++
        println(contador)
    }

    repeat(3) {
        println("Oi 3 vzes :D")
    }
}
fun testandoRanges(): Unit{
    for (i in 0..10) {
        println("Primeiro for = $i")
    }

    for (i in 10 downTo 0 step 2) {
        println("Decrescente $i")
    }

    for (i in 10 downTo 0 step 2) {
        println("Decrescente $i")
    }

    for (i in 10..20 step 5) {
        println("5 em 5 $i")
    }

    if (10 in 4..99)
        println("Esta entre 4 e 99")

}

fun tiposNull(nome: String?): String {
    return nome ?: "O nome não foi não foi fornecido 😢"
}

fun tiposEnumerados() {
    val uni: PlaykidsUnidades = PlaykidsUnidades.UNI
    println("Unidade ${uni.ordinal}")
    print("Alexandre trabalha no endereço ${PlaykidsUnidades.CAMPINAS.endereco}")
}
