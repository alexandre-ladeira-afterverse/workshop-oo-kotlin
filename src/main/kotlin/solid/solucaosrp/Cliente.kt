package solid.solucaosrp


class Cliente(
    val id: Int,
    val nome: String,
    val email: String,
    val cpf: String) {

    fun isValid(): Boolean {
        return EmailService.isEmailValid(email) && CPFService.isCpfValid(cpf)
    }


}