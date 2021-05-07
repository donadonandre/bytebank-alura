package br.com.alura.bytebank

import br.com.alura.bytebank.modelo.Endereco

fun main() {
    val enderecoCompleto = with(Endereco()) {
        logradouro = "Rua de Teste"
        numero = 12345
        bairro = "Centro"
        cidade = "São Paulo"
        estado = "SP"
        cep = "01234-999"
        complemento = "Fábrica"
        completo()
    }
}

