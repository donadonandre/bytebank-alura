package br.com.alura.bytebank.teste

fun testaHOF() {
    soma(1, 5, resultado = (::println))
}

fun soma(a: Int, b: Int, resultado:(Int) -> Unit) {
    println("Soma sendo efetuada")
    resultado(a+b)
    println("Soma feita")
}