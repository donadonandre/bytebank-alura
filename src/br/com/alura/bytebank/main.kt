package br.com.alura.bytebank

import br.com.alura.bytebank.modelo.Autenticavel
import br.com.alura.bytebank.modelo.Endereco
import br.com.alura.bytebank.modelo.SistemaInterno

fun main() {
//    val endereco = Endereco(logradouro = "Rua Maestro", numero = 345)
//    val enderecoMaiusculo = "${endereco.logradouro}, ${endereco.numero}".toUpperCase()
//    println(enderecoMaiusculo)
//
//    // OU
//
//    Endereco(logradouro = "Rua Maestro", numero = 345)
//        .let { endereco ->
//            "${endereco.logradouro}, ${endereco.numero}".toUpperCase()
//        }
//        .let(::println)
//
//    listOf(
//        Endereco(),
//        Endereco(complemento = "apartamento"),
//        Endereco(complemento = "casa")
//    )
//        .filter { endereco -> endereco.complemento.isNotEmpty() }
//        .let(::println)

    //println(soma(1, 5))
//    soma(1, 5){ execucao ->
//        println(execucao)
//    }

    val autenticavel = object : Autenticavel {
        val senha = 1234
        override fun autentica(senha: Int) = this.senha == senha
    }

    SistemaInterno().entra(autenticavel, 1234) {
        println("Pode pagar")
    }
}

fun soma(a: Int, b: Int, resultado:(Int) -> Unit) {
    println("Soma sendo efetuada")
    resultado(a+b)
    println("Soma feita")
}