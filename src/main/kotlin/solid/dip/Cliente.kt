package solid.dip

class Cliente(
    val id: Int,
    val nome: String,
    val email: String,
    val cpf: String,
    private val cpfServices: CPFServices,
    private val emailServices: EmailServices
) {
    fun isValid(): Boolean {
        return emailServices.isValid(email) && cpfServices.isValid(cpf)
    }
}