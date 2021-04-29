package br.com.alura.bytebank

import java.lang.ArithmeticException
import java.lang.NumberFormatException

fun main() {
    val entrada: String = "1,9"
    val valorRecebido: Double? = try {
        entrada.toDouble()
    } catch(e: NumberFormatException) {
        println("Problema na conversão")
        e.printStackTrace()
        null
    }

    if ( valorRecebido != null ) {
        println("valor recebido $valorRecebido")
    }
    else {
        println("valor recebido está nulo")
    }

    // -----
    // ou
    // -----

    val novoValor: Double? = try { entrada.toDouble() } catch(e:NumberFormatException) { null }

    if ( novoValor != null ) {
        println("novo valor $novoValor")
    }
    else {
        println("novoValor está nulo")
    }

//    try {
//        println("Rodou aqui")
//        //10/0
//        10/2
//    } catch (e: ArithmeticException) {
//        println(e.message)
//        println(e.stackTrace)
//        println(e.cause)
//
//        e.printStackTrace() // Exibe as 3 mensagens acima.
//        println("ATENÇÃO: ArithmeticException foi pegada.")
//    }
//    finally {
//        println("Isso daqui rodou mesmo assim!")
//    }
}