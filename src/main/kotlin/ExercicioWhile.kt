fun caixa() {
    var balao = 0
    var i = 1
    while (i < 2000) {
        i += 7
        balao++
    }
    println(balao)
}

fun fizzbuzz() {
    var i = 1
    while (i <= 50) {
        if (i % 3 == 0 && i % 5 == 0) {
            println("FizzBuzz")
        } else if (i % 3 == 0) {
            println("Buzz")
        } else if (i % 5 == 0) {
            println("Fizz")
        } else println(i)
        i++
    }
}

fun inverte() {
    print("Entre com o nome: ")
    val str = readln()
    var i = str.length
    if (str != "") {
        while (i > 0) {
            val str1 = str[i - 1]
            print(str1)
            i--
        }
    }
}

fun main() {
    caixa()
    fizzbuzz()
    inverte()
}
