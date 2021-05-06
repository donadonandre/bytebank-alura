package br.com.alura.bytebank

import br.com.alura.bytebank.modelo.Autenticavel
import br.com.alura.bytebank.modelo.Endereco
import br.com.alura.bytebank.modelo.SistemaInterno

fun main() {
//    val endereco = Endereco(logradouro = "Rua Maestro", numero = 345)
//    val enderecoMaiusculo = "${endereco.logradouro}, ${endereco.numero}".toUpperCase()
//    println(enderecoMaiusculo)

//    Endereco(logradouro = "Rua Maestro", numero = 345)
//        .let { endereco ->
//            "${endereco.logradouro}, ${endereco.numero}".toUpperCase()
//        }
//        .let(::println)

    // Ou com Scope Functions

    Endereco(logradouro = "Rua Maestro", numero = 345)
        .apply {
            "$logradouro, $numero".toUpperCase()
        }
        .let(::println)

    // ***** Está funcionando mas não aplicou o maiúsculo, porque é um objeto de contexto

//    listOf(
//        Endereco(),
//        Endereco(complemento = "apartamento"),
//        Endereco(complemento = "casa")
//    )
//        .filter(predicate = { endereco -> endereco.complemento.isNotEmpty() })
//        .let(::println)
//
//    //println(soma(1, 5))
//    soma(1, 5, resultado = (::println))
//
//    val autenticavel = object : Autenticavel {
//        val senha = 1234
//        override fun autentica(senha: Int) = this.senha == senha
//    }
//
//    SistemaInterno().entra(autenticavel, 1234, autenticado = {
//        println("Pode pagar")
//    })
}

fun soma(a: Int, b: Int, resultado:(Int) -> Unit) {
    println("Soma sendo efetuada")
    resultado(a+b)
    println("Soma feita")
}