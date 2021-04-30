package br.com.alura.bytebank

import br.com.alura.bytebank.exception.SaldoInsuficienteException
import java.lang.ClassCastException

fun main() {
    for (i in 1..5) {
        println(i)
        val endereco = Any()
        throw SaldoInsuficienteException()
    }
}