class Portaria {


    fun controle() {
        val idade = Console.readInt("Qual sua idade? ")
        if (idade < 18){
            println("Negado. Menores de idade não são permitidos")
            return
        }
        val tipoConvite = Console.readString("Qual o tipo do convite? ")
        if (tipoConvite != "comum" && tipoConvite != "premium" && tipoConvite != "luxo"){
            println("Negado. Convite inválido.")
            return
        }
        val codigoConvite = Console.readString("Qual o código do convite? ")
        if (tipoConvite == "comum" && codigoConvite.startsWith("xt")) {
            println("Welcome :)")
        } else if ((tipoConvite == "premium" || tipoConvite == "luxo") && codigoConvite.startsWith("xl")
        ) {
            println("Welcome :)")
        } else {
            println("Negado. Convite inválido")
        }
    }
}