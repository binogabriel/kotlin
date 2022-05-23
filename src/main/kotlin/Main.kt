fun main() {

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
}