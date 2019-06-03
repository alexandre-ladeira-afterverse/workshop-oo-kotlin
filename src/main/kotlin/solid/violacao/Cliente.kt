package SOLID.violacao

import com.sun.tools.corba.se.idl.InvalidArgument

class Cliente(
    val id: Int,
    val nome: String,
    val email: String,
    val cpf: String) {

    fun AdicionarCliente(){

        if (!email.contains('@'))
            throw InvalidArgument("Email Inválido")

        if (cpf.length != 11)
            throw InvalidArgument("CPF Inválido")

        /*
        * Logica para adicionar o cliente ao banco de dados
        * */

        /*
        * Logica para enviar emai lao cliente
        * */

    }
}