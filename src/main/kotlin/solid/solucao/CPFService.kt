package SOLID.solucao

class CPFService {
    companion object {
        fun isCpfValid(cpf: String): Boolean {
            return cpf.length == 11
        }
    }
}