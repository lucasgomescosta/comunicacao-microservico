package br.com.cursoudemy.productapi.modules.produto.model

import javax.persistence.*

@Entity(name = "SUPPLIER")
data class Supplier (

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    var id: Int,

    @Column(name = "NAME", nullable = false)
    var name: String

    )