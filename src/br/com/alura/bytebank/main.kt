package br.com.alura.bytebank

import br.com.alura.bytebank.modelo.Cliente
import br.com.alura.bytebank.modelo.ContaPoupanca
import br.com.alura.bytebank.modelo.Endereco

fun main() {
    testaRun()
}

fun testaRun() {
    val taxaAnual = 0.05
    val taxaMensal = taxaAnual / 12
    println("Taxa mensal: $taxaMensal")

    val contaPoupanca = ContaPoupanca(
        Cliente(
            nome = "André",
            cpf = "111.111.111-11",
            senha = 1234
        ), 1000
    )

    contaPoupanca.run {
        deposita(1000.0)
        saldo + taxaMensal
    }.let { rendimentoMensal ->
        println(rendimentoMensal)
    }

    val rendimentoAnual = run {
        var saldo = contaPoupanca.saldo
        repeat(12) {
            saldo += saldo * taxaMensal
        }
        saldo
    }
    println("Simulação de Rendimento anual: $rendimentoAnual")
}

private fun testaWith() {
    with(Endereco()) {
        logradouro = "Rua de Teste"
        numero = 12345
        bairro = "Centro"
        cidade = "São Paulo"
        estado = "SP"
        cep = "01234-999"
        complemento = "Fábrica"
        completo()
    }.let { enderecoCompleto: String ->
        println(enderecoCompleto)
    }
}

