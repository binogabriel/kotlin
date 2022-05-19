import java.text.Normalizer.Form

class Pessoa(val anoNascimento: Int, var nome: String) {

    var olho: String = ""

    var documento = ""
    var doc: String? = null
    var olhos: String? = null

    constructor(anoNascimento: Int, nome: String, doc: String, olhos: String) : this(anoNascimento, nome) {
        this.doc = doc
        this.olhos = olhos
    }

    fun dormir() {

    }

    fun acordar() {

    }
}

class Animal(var especie: String) {
    var fala = ""
        get() {
            println("get")
            return field
        }
        set(value) {
            println("set")
            field = value
        }
/*
    init {
        if (especie == "cachorro") {
            fala = "não"
        } else {
            fala = "sim"
        }
    }
*/
}


enum class Prioridade(val value: Int) {
    Baixa(1) {
        override fun toString(): String {
            return "Prioridade Baixa $value"
        }
    },
    Media(5),
    Alta(10)
}

enum class Animalenum {
    Cachorro, Gato, Cavalo, Vaca
}

class Forma(val a: Int, val b: Int) {
    override fun equals(other: Any?): Boolean {
        return if (other is Forma) {
            (other.a == this.a && other.b == this.b)

        } else {
            false
        }
    }
}

data class DataForma(val a: Int, val b: Int)

open class Eletronico(var marca:String){        // precisa ser open para que possam herdar dela
    private fun ativarCorrente(){}
    fun liga(){
        ativarCorrente()
    }
    fun desliga(){}
}

class Computador(marca:String): Eletronico(marca){
    fun instalar(){}
    fun processar(){}
}

fun main() {
//-----------------------------------------------Encapsulamento----------------------------------------------------
    // class - comportamentos e atributos
/*
    // classe (instancia) objetos
    var mulher: Pessoa = Pessoa(2020, "asd", "10804861609", "pretos") // usa o construtor secundário
    var homem: Pessoa = Pessoa(2000, "fulano") // usa o construtor primário

    // this = se refere ao objeto

    mulher.anoNascimento
    mulher.nome
    mulher.dormir()
    mulher.acordar()
    mulher.olhos = "preto"
    println(mulher.olhos)
*/
/*
    val a = Animal("cachorro")         //só entra no get (se tiver ser o fala)
    a.fala = "auuuu"                        //só entra no set
*/
/*
    for (p in Prioridade.values()){
        println(p)
        }
*/
/*
    val f1: DataForma = DataForma(10, 8)
    //f1.equals()
    println(f1.toString())
    println(f1.hashCode())
    val f2: DataForma = DataForma(10, 8)
    println(f1.equals(f2))                  //quando se vai usar essas 3 funções, usar data class para comparar os dados
    println(f2.toString())                  //
    println(f2.hashCode())                  //
*/
//---------------------------------------Herança--------------------------------------------------------

    var c:Computador = Computador("Dell")
    c.liga()
    c.desliga()
    c.instalar()
    c.processar()
    c.marca

    var e:Eletronico = Eletronico("Asus")
    e.liga()
    e.desliga()
    e.marca


}