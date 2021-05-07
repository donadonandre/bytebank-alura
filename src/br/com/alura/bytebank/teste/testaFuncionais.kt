package br.com.alura.bytebank.teste

fun testaMetodoFuncional() {
    val calculaBonificacao: (salario: Double) -> Double = lambda@{ salario ->
        if (salario > 1000.0) {
            return@lambda salario + 50.0
        }
        salario + 100.0
    }
    println(calculaBonificacao(1000.0))

    val calculaBonificacaoAnonima: (salario: Double) -> Double = fun(salario): Double {
        if (salario > 1000.0) {
            return salario + 50.0
        }
        return salario + 100.0
    }
    println(calculaBonificacaoAnonima(1000.0))
}

fun testaFuncaoAnonima() {
//    val minhaFuncaoAnonima: (Int, Int) -> Int = fun(a, b) : Int {
//        return a + b
//    }
//    ou
    val minhaFuncaoAnonima = fun(a: Int, b: Int) : Int {
        return a + b
    }
    println(minhaFuncaoAnonima(20, 9))
}

fun testaFuncaoLambda() {
//    val minhaFuncaoLambda: (Int, Int) -> Int = { a, b ->
//        a + b
//    }
//    ou
    val minhaFuncaoLambda = { a: Int, b: Int ->
        a + b
    }
    println(minhaFuncaoLambda(15, 10))
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
