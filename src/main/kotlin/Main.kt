import javax.print.attribute.SetOfIntegerSyntax

fun main() {
/*
    //------------------------------------------------------List--------------------------------------------------------
    val lst1: List<Int> = listOf(1, 2, 3, 4, 5)
    val lst2: MutableList<Int> = mutableListOf(1, 2, 3, 4, 5)

    println(lst2[0])
    lst2.add(10)
    println(lst2.size)

    lst2.add(0)                     //add o argumento no fim
    lst2.removeAt(0)            //remove na posição
    println(lst2.contains(2))           //vê se contem o argumento na list
    lst2.clear()                    //limpa a list
    println(lst2)

*/
    /*
    //----------------------------------------------------Set----------------------------------------------------------

    val set1:Set<String> = setOf<String>("a","b","c","c")
    val set2:MutableSet<String> = mutableSetOf<String>()      //se falar o tipo de variável, pode ser vazio

    set2.add("São Paulo")
    set2.remove("São Paulo")
    println(set2.contains("São Paulo"))

    // não tem set.removeat, porque ele não tem posições definidas

    */
/*
    //-----------------------------------------------Map-------------------------------------------------------
    //
    val map1 = mapOf<String,String>(Pair("Brasil","Brasilia"),Pair("Alemanha","Berlim"),Pair("Alemanha","Berlim"))                //<CHAVE, VALOR>
    val map2 = mutableMapOf<String, String>()

    println(map1)
    println(map1.entries)
    println(map1.values)

    map2["França"] = "Paris"            //adicionar

    map2.remove("França")
    map2.contains("Brasil")
    map2.clear()

    println(map1["Brasil"])

    */
    // ----------------------------------------------------------------------------------------------------------------
    val data = geraDados()

    println(data.any())     // retorna true se tiver alguma coisa dentro da coleção
    println(data.count())   // retorna quantos elementos tem na coleção
    println(data.first())
    println(data.last())
    println(data.component5())
    println(listOf(1, 2, 3, 4, 5).sum())
    println(data.sumOf { it.calorias })

    println(data.filter { it.nome == "Lasanha" })    //se existe algum elemento na sua coleção com o nome/valor "Lasanha"
    println(data.filter { it.calorias > 500 })
    println(data.any { it.calorias > 500 })
    println(data.count { it.calorias > 500 })

    println(data.take(2))                        //pega as n primeiras receitas
    println(data.takeLast(2))                    //pega as n ultimas receitas

    data.forEach{ println(it.nome) }      //para cada elemento da coleção, ele faz uma ação

    println(data.maxOf { it.calorias })     //retorna o numero
    println(data.maxByOrNull { it.calorias })   //retorna o elemento
    println(data.minOf { it.calorias })

    println(data.map { it.nome })           //cria uma lista somente com os nomes
    println(data.map { it.calorias })       //cria uma lista somente com as calorias
    println(data.map { it.calorias }.sum())
    println(data.map { Receita(it.nome, it.calorias) })

    println(listOf(1,2,3,5,8,7,9).average())
    println(data.map { it.calorias }.average())

    val lst = listOf(1,5,22,1,6,8,7,54,1,1,2,2,2)

    println(lst.distinct())                 //não mostra as coisas duplicadas
    println(data.distinctBy { it.nome })

    println(lst.sorted())                   //ordem crescente
    println(lst.sortedDescending())

    println(lst.reversed())

}

fun geraDados(): List<Receita> {
    return listOf(
        Receita(
            "Lasanha", 1200,
            listOf(
                Ingrediente("Presunto", 5),
                Ingrediente("Queijo", 10),
                Ingrediente("Molho de tomate", 2),
                Ingrediente("Manjerição", 3)
            )
        ),
        Receita("Panqueca", 500),
        Receita("Omelete", 200),
        Receita("Parmegiana", 700),
        Receita("Sopa de feijão", 300),
        Receita(
            "Hamburguer", 2000,
            listOf(
                Ingrediente("Pão", 1),
                Ingrediente("Hamburguer", 3),
                Ingrediente("Queijo", 1),
                Ingrediente("Catupiry", 1),
                Ingrediente("Bacon", 3),
                Ingrediente("Alface", 1),
                Ingrediente("Tomate", 1)
            )
        )
    )
}

data class Receita(val nome: String, val calorias: Int, val ingredientes: List<Ingrediente> = listOf()) {

}

data class Ingrediente(val nome: String, val quantidade: Int)