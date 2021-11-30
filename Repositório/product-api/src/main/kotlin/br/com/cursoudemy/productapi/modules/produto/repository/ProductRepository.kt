package br.com.cursoudemy.productapi.modules.produto.repository

import br.com.cursoudemy.productapi.modules.produto.model.Product
import org.springframework.data.jpa.repository.JpaRepository

interface ProductRepository : JpaRepository<Product, Int> {
}