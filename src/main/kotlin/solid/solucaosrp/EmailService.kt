package solid.solucaosrp

class EmailService {
    companion object {
        fun isEmailValid(email: String): Boolean {
            return email.contains('@')
        }

        fun enviarEmail(email:String) {
            // logica para enviar email
        }
    }
}