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
    Baixa(1){
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


fun main() {
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
    for (p in Prioridade.values()){
        println(p)
        }
}