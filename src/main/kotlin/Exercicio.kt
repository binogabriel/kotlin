/*fun quadrado(a: String, b: String) {
    if (a != null && a != "" && b != null && b != "") {
        if (a.toInt() == b.toInt()) {
            println("É um quadrado")
        } else {
            println("num é um quadrado")
        }
    }
}

fun triangulo(c: String, d: String, e: String) {
    if (c != null && c != "" && d != null && d != "" && e != null && e != "") {
        if (c.toInt() == d.toInt()  && c.toInt() == e.toInt()) {
            println("equilatero")
        } else {
            println("num é")
        }
    }
}
fun portaria() {
    val idade = readln()


    if (idade.toInt() >= 18) {
        var tipo = readln()
        tipo = tipo.lowercase()
        if (tipo == "comum" || tipo == "premium" || tipo == "luxo") {
            var codigo = readln()
            codigo = codigo.uppercase()
            if (codigo == "XL" && (tipo == "premium" || tipo == "luxo")) {
                println("Welcome :)")

            } else if (codigo == "XT" && (tipo == "comum")) {
                println("Welcome :)")

            } else println("Negado. Código inválido")
        } else println("Negado. Convite inválido")
    } else println("Negado. Menores de idade não são permitidos")
}

*/

fun exc1() {
    for (i in 1..50) {
        if (i % 5 != 0) {
            print("$i ")
        }
    }
}

fun exc2() {
    for (i in 50 downTo 1) {
        //asdasd
        print("$i ")
    }
}

fun exc4() {
    var s = 0
    for (j in 1..500) {
        s += j
    }
    println("$s")
}

fun exc5() {
    print("Entre com um número: ")
    val n = readln()
    var str = "#"
    if (n != null && n != "") {
        for (i in 1..n.toInt()) {
            val str1 = "#"
            println(str)
            str += str1
        }
    }
}


fun main() {
    //quadrado(a = readln(), b= readln())
    //triangulo(c = readln(), d = readln(), e = readln())
    //portaria()
    exc1()
    println()
    exc2()
    println()
    exc4()
    println()
    exc5()
}

