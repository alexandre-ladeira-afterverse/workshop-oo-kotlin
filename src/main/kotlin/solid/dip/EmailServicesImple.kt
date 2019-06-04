package solid.dip

class EmailServicesImple: EmailServices {
    override fun isValid(email: String): Boolean {
        return email.contains('@')
    }

    override fun enviar(email: String) {
       //logica para enviar o email
    }
}