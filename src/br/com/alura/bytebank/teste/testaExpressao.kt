package br.com.alura.bytebank.teste

import java.lang.NumberFormatException

fun testaExpressao() {
    val entrada: String = "1,9"
    val valorRecebido: Double? = try {
        entrada.toDouble()
    } catch (e: NumberFormatException) {
        println("Problema na conversão")
        e.printStackTrace()
        null
    }

    if (valorRecebido != null) {
        println("valor recebido $valorRecebido")
    } else {
        println("valor recebido está nulo")
    }

    // -----
    // ou
    // -----

    val novoValor: Double? = try {
        entrada.toDouble()
    } catch (e: NumberFormatException) {
        null
    }

    if (novoValor != null) {
        println("novo valor $novoValor")
    } else {
        println("novoValor está nulo")
    }
}