package br.com.alura.bytebank.teste

fun lastException() {
    testaComportamentosConta()

    for (i in 1..5) {
        println(i)
        val endereco = Any()
        //throw SaldoInsuficienteException()
    }
}