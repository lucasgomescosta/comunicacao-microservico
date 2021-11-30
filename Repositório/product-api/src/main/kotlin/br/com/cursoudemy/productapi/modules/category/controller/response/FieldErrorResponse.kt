package br.com.cursoudemy.productapi.modules.produto.controller.response

data class FieldErrorResponse (
    var message: String,
    var field: String
)