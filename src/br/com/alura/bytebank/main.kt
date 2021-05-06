package br.com.alura.bytebank

fun main() {
//    testaFuncaoReferencia()
//    testaFuncaoClasse()

    // Fica vinculada a variável e não dá pra reaproveitar a lógica.
    testaFuncaoLambda()
    testaFuncaoAnonima()
}

fun testaFuncaoAnonima() {
    val minhaFuncaoAnonima: () -> Unit = fun() {
        println("Executa como anonima")
    }
    println(minhaFuncaoAnonima())
}

fun testaFuncaoLambda() {
    val minhaFuncaoLambda: () -> Unit = {
        println("Executa como lambda")
    }
    println(minhaFuncaoLambda())
}

fun testaFuncaoClasse() {
    val minhaFuncaoClasse: () -> Unit = Teste()
    println(minhaFuncaoClasse())

    val outroTeste = OutroTeste()
    println(outroTeste())
}

fun testaFuncaoReferencia() {
    val minhaFuncao: () -> Unit = ::teste
    println(minhaFuncao())
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
