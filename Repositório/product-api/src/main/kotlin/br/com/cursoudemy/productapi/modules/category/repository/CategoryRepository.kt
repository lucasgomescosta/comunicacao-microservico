package br.com.cursoudemy.productapi.modules.produto.repository

import br.com.cursoudemy.productapi.modules.produto.model.Category
import org.springframework.data.jpa.repository.JpaRepository

interface CategoryRepository : JpaRepository<Category, Int> {
}