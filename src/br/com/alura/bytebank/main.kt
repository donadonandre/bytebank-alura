package br.com.alura.bytebank

import br.com.alura.bytebank.modelo.Endereco

fun main() {
    val endereco = Endereco(logradouro = "Rua Maestro", numero = 345)
    val enderecoMaiusculo = "${endereco.logradouro}, ${endereco.numero}".toUpperCase()
    println(enderecoMaiusculo)

    // OU

    Endereco(logradouro = "Rua Maestro", numero = 345)
        .let { endereco ->
            "${endereco.logradouro}, ${endereco.numero}".toUpperCase()
        }
        .let { enderecoMaiusculoLet ->
            println(enderecoMaiusculoLet)
        }
}