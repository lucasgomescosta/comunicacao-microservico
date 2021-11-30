package br.com.cursoudemy.productapi.modules.produto.service

import br.com.cursoudemy.productapi.modules.produto.model.Category
import br.com.cursoudemy.productapi.modules.produto.repository.CategoryRepository
import org.springframework.stereotype.Service

@Service
class CategoryService (
    private val categoryRepository: CategoryRepository
) {

    fun create(category: Category) {
        categoryRepository.save(category)
    }
}