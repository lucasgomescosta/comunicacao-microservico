package br.com.cursoudemy.productapi.modules.produto.model

import javax.persistence.*

@Entity(name = "PRODUCT")
data class Product (

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    var id: Int,

    @Column(name = "NAME", nullable = false)
    var name: String,

    @ManyToOne
    @JoinColumn(name = "FK_SUPPLIER", nullable = false)
    var supplier: Supplier,

    @ManyToOne
    @JoinColumn(name = "FK_CATEGORY", nullable = false)
    var category: Category,

    @Column(name = "QUANTITY_AVAILABLE", nullable = false)
    var quantityAvailable: Int
    )