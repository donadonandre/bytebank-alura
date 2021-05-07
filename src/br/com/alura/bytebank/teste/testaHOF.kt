package br.com.alura.bytebank.teste

fun testaHOF() {
    soma(1, 5, resultado = { valor ->
        println(valor)
    })
    somaReceiver(1, 5, resultado = {
        println(this)
    })
}

fun soma(a: Int, b: Int, resultado:(Int) -> Unit) {
    println("Soma sendo efetuada")
    resultado(a+b)
    println("Soma feita")
}

fun somaReceiver(a: Int, b: Int, resultado:Int.() -> Unit) {
    println("Soma sendo efetuada")
    val total = a + b
    total.resultado()
    println("Soma feita")
}