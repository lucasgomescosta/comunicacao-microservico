package br.com.cursoudemy.productapi.modules.produto.controller

import br.com.cursoudemy.productapi.modules.produto.extension.toCategoryModel
import br.com.cursoudemy.productapi.modules.produto.controller.request.PostCategoryRequest
import br.com.cursoudemy.productapi.modules.produto.service.CategoryService
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.*
import javax.validation.Valid

@RestController
@RequestMapping("/api/category")
class CategoryController (
    private val categoryService: CategoryService
)
{

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    fun create(@RequestBody @Valid category : PostCategoryRequest) {
        categoryService.create(category.toCategoryModel())
    }
}