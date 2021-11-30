package br.com.cursoudemy.productapi.modules.produto.controller.request

import javax.validation.constraints.NotEmpty


data class PostCategoryRequest (

        @field:NotEmpty(message = "Descrição deve ser informada!")
        var description: String,
)