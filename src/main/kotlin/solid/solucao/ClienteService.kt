package SOLID.solucao

import com.sun.tools.corba.se.idl.InvalidArgument

class ClienteService {

    fun adicionarCliente(cliente: Cliente) {
        if (!cliente.isValid())
            throw InvalidArgument("O cliente é invalido!")

        val repo = ClienteRepository()
        repo.adicionarCliente(cliente)

        EmailService.enviarEmail(cliente.email)
    }
}