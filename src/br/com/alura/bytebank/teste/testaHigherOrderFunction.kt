package br.com.alura.bytebank.teste

import br.com.alura.bytebank.modelo.Endereco

fun main() {
    val testeFuncao: () -> Unit

    Endereco().let {
        it
    }
    "".let(::testeRecebeString)

    1.let {
        it
    }
    teste({}, 1)
    outroTeste(1) {}
}

fun testeRecebeString(valor: String){

}

// higher order function
fun teste(bloco:() -> Unit, inteiro: Int) {

}

fun outroTeste(inteiro: Int, bloco:() -> Unit) {

}