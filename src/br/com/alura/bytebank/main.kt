package br.com.alura.bytebank

fun main() {
    testaFuncaoReferencia()
    testaFuncaoClasse()

    // Fica vinculada a variável e não dá pra reaproveitar a lógica.
//    testaFuncaoLambda()
//    testaFuncaoAnonima()
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
    val minhaFuncaoClasse: (Int, Int) -> Int = Soma()
    println(minhaFuncaoClasse(12, 10))

    val outroTeste = OutroTeste()
    println(outroTeste())
}

fun testaFuncaoReferencia() {
    val minhaFuncao: (Int, Int) -> Int = ::soma
    println(minhaFuncao(5, 10))
}

fun soma(a: Int, b: Int): Int {
    return a + b
}

class Soma : (Int, Int) -> Int {
    override fun invoke(p1: Int, p2: Int): Int = p1 + p2
}

class OutroTeste {
    operator fun invoke() {
        println("Outro Invoke aqui")
    }
}
