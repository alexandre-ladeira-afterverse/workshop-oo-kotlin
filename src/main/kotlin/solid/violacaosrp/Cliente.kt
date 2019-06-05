package solid.violacaosrp

class Cliente(
    val id: Int,
    val nome: String,
    val email: String,
    val cpf: String) {

    fun AdicionarCliente(){

        if (!email.contains('@'))
            throw IllegalArgumentException("Email Inválido")

        if (cpf.length != 11)
            throw IllegalArgumentException("CPF Inválido")

        /*
        * Logica para adicionar o cliente ao banco de dados
        * */

        /*
        * Logica para enviar email ao cliente
        * */

    }
}