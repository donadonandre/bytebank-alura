package br.com.alura.bytebank

fun main() {
    val minhaFuncao: () -> Unit = ::teste
    println(minhaFuncao())
}

fun teste() {
    println("executa teste")
}

