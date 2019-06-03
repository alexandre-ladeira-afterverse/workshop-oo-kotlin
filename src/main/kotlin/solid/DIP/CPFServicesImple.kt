package solid.DIP

class CPFServicesImple: CPFServices {
    override fun isValid(cpf: String): Boolean {
       return cpf.length == 11
    }
}