package business

import entity.Convite

class ConvidadoBusiness {
    fun tipoValido(tipo: String) = (tipo == "comum" || tipo == "premium" || tipo == "luxo")

    fun maiorDeIdade(idade: Int) = idade >= 18

    fun codigoValido(convite: Convite): Boolean {
        return when (convite.tipo) {
            "comum" -> convite.codigo.startsWith("xt")
            "premium", "luxo" -> convite.codigo.startsWith("xl")
            else -> false
        }
    }
}
