package br.com.cursoudemy.productapi.modules.produto.extension

import br.com.cursoudemy.productapi.modules.produto.controller.request.PostCategoryRequest
import br.com.cursoudemy.productapi.modules.produto.model.Category

fun PostCategoryRequest.toCategoryModel(): Category {
    return Category(description = this.description)
}