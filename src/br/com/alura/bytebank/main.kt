package br.com.alura.bytebank

import java.lang.ArithmeticException

fun main() {
    try {
        println("Rodou aqui")
        //10/0
        10/2
    } catch (e: ArithmeticException) {
        println("ATENÇÃO: ArithmeticException foi pegada.")
    }
    finally {
        println("Isso daqui rodou mesmo assim!")
    }
}