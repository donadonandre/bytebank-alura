package br.com.alura.bytebank

import java.lang.ArithmeticException

fun main() {
    val entrada: String = "1"
    val valor: Double = entrada.toDouble()


    try {
        println("Rodou aqui")
        //10/0
        10/2
    } catch (e: ArithmeticException) {
        println(e.message)
        println(e.stackTrace)
        println(e.cause)

        e.printStackTrace() // Exibe as 3 mensagens acima.
        println("ATENÇÃO: ArithmeticException foi pegada.")
    }
    finally {
        println("Isso daqui rodou mesmo assim!")
    }
}