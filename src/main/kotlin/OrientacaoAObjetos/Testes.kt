package OrientacaoAObjetos

fun main() {
    val joao = Colaborador(
        "Joao da Silva",
        "123.123.123-1",
        "15/10/1998",
        50000.00,
        null)

    val pedro = Colaborador(
        nome = "Pedro Oliveira",
        cpf = "888.999.111-1",
        dataDeNascimento = "14/07/2000",
        idade = 18
    )

    joao.idade = 20
    //joao.nome = "Outro nome" -> Não é permitido, pois o campo nome de Colaborador é imutavel

    println(joao)
    println(pedro)
    println("Salario do joao é ${joao.salario}")

    val umEscritorio = Escritorio("Rua qualquer 00", joao, 123)

    umEscritorio.abrir(123)


}

