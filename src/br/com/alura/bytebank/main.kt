package br.com.alura.bytebank

import java.lang.ClassCastException

fun main() {
    for (i in 1..5) {
        println(i)
        val endereco = Any()
        throw ClassCastException()
    }
}