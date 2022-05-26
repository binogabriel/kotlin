package business

import entity.Convidado

class ConvidadoBusiness {
    fun tipoValido(tipo: String) = (tipo == "comum" || tipo == "premium" || tipo == "luxo")

    fun maiorDeIdade(idade: Int) = idade >= 18

    fun codigoValido(convidado: Convidado): Boolean {
        return when (convidado.tipo) {
            "comum" -> convidado.codigo.startsWith("xt")
            "premium", "luxo" -> convidado.codigo.startsWith("xl")
            else -> false
        }
    }
}
