package solid.dip

class ClienteServiceImple(
    private val emailServices: EmailServices,
    private val clienteRepository: ClienteRepository
): ClienteService {
    override fun adicionarCliente(cliente: Cliente) {
        if (!cliente.isValid())
            throw IllegalArgumentException ("O cliente não é invalido!")

        clienteRepository.adicionarCliente(cliente)
        emailServices.enviar(cliente.email)
    }
}