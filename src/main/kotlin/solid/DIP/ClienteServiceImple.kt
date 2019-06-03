package solid.DIP

import com.sun.tools.corba.se.idl.InvalidArgument

class ClienteServiceImple(
    private val emailServices: EmailServices,
    private val clienteRepository: ClienteRepository
): ClienteService {
    override fun adicionarCliente(cliente: Cliente) {
        if (!cliente.isValid())
            throw InvalidArgument("O cliente é invalido!")

        clienteRepository.adicionarCliente(cliente)
        emailServices.enviar(cliente.email)
    }
}