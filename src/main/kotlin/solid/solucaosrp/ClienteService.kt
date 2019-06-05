package solid.solucaosrp

class ClienteService {

    fun adicionarCliente(cliente: Cliente) {
        if (!cliente.isValid())
            throw IllegalArgumentException("O cliente não é válido")

        val repo = ClienteRepository()
        repo.adicionarCliente(cliente)

        EmailService.enviarEmail(cliente.email)
    }
}