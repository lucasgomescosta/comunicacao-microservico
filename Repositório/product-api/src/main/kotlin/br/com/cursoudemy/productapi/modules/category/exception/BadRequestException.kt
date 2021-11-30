package br.com.cursoudemy.productapi.modules.produto.exception

class BadRequestException (
        override val message: String,
        val errorCode: String
): Exception() {
}