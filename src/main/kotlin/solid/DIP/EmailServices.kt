package solid.DIP

interface EmailServices {

    fun isValid(email: String): Boolean
    fun enviar(email: String)
}