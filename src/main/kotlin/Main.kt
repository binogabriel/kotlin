import javax.print.attribute.SetOfIntegerSyntax

fun main() {
/*
    //List
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
    //Set

    val set1:Set<String> = setOf<String>("a","b","c","c")
    val set2:MutableSet<String> = mutableSetOf<String>()      //se falar o tipo de variável, pode ser vazio

    set2.add("São Paulo")
    set2.remove("São Paulo")
    println(set2.contains("São Paulo"))

    // não tem set.removeat, porque ele não tem posições definidas

    */

    //Map
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
}