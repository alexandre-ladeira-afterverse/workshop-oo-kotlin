package orientacaoaobjetos

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

    val joaoAlterado = joao.copy(dataDeNascimento = "14/02/1997")
    //joao.nome = "Outro nome" -> Não é permitido, pois o campo nome de Colaborador é imutavel

    println(pedro)
    println(joao)
    println(joaoAlterado)
//    println("Salario do joão é ${joao.salario}")
//
//    val umEscritorio = Escritorio("13987-550", joao, 123)
//
//    umEscritorio.abrir(123)



}

