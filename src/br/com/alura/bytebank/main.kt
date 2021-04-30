package br.com.alura.bytebank

import br.com.alura.bytebank.exception.SaldoInsuficienteException
import br.com.alura.bytebank.teste.testaComportamentosConta
import java.lang.ClassCastException

fun main() {
    testaComportamentosConta()

    for (i in 1..5) {
        println(i)
        val endereco = Any()
        //throw SaldoInsuficienteException()
    }
}