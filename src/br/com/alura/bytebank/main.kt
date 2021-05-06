package br.com.alura.bytebank

fun main() {
    val minhaFuncao: () -> Unit = ::teste
    println(minhaFuncao())

    val minhaFuncaoClasse: () -> Unit = Teste()
    println(minhaFuncaoClasse())

    val outroTeste = OutroTeste()
    println(outroTeste())
}

fun teste() {
    println("executa teste")
}

class Teste : () -> Unit {
    override fun invoke() {
        println("Executa Invoke do Teste")
    }
}

class OutroTeste {
    operator fun invoke() {
        println("Outro Invoke aqui")
    }
}
