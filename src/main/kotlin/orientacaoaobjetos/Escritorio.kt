package orientacaoaobjetos

class Escritorio (
    val endereco: String,
    val recepcionista: Colaborador,
    var estaAberto: Boolean,
    private val senha: Int
) {

    constructor(
        endereco: String,
        recepcionista: Colaborador,
        senha: Int) : this(endereco, recepcionista, false, senha)

    fun abrir(senha: Int) {
        if (this.senha == senha && !estaAberto) {
            println("${this.recepcionista.nome} abriu o escritório")
            this.estaAberto = true
        } else {
            println("Não foi possível abrir o escritório")
        }

    }

    fun fechar() {
        if(estaAberto){
            println("${this.recepcionista.nome} fechou o escritório")
            this.estaAberto = false
        } else {
            println("O escritório já fechou!")
        }
    }






}