package orientacaoaobjetos

class Escritorio (
    val cep: String,
    val recepcionista: Colaborador,
    var estaAberto: Boolean,
    private val senha: Int
) {

    constructor(
        cep: String,
        recepcionista: Colaborador,
        senha: Int) : this(cep, recepcionista, false, senha)

    init {

        if (!cep.matches(FORMATO_DO_CEP.toRegex())) {
            println("CEP no formato errado!")
        }

    }

    fun abrir(senha: Int) {
        if (this.senha == senha && !estaAberto) {
            println("${this.recepcionista.nome} abriu o escritório")
            this.estaAberto = true
        } else {
            println("Não foi possível abrir o escritório")
        }

    }

    fun fechar() {
        if(estaAberto) {
            println("${this.recepcionista.nome} fechou o escritório")
            this.estaAberto = false
        } else {
            println("O escritório já fechou!")
        }
    }

    companion object {
        val FORMATO_DO_CEP = "[0-9]{5}-[\\d]{3}" // constante



    }

}