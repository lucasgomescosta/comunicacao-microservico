package br.com.cursoudemy.productapi.modules.produto.model

import javax.persistence.*

@Entity(name = "CATEGORY")
data class Category (

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    var id: Int? = null,

    @Column(name = "DESCRIPTION", nullable = false)
    var description: String

)