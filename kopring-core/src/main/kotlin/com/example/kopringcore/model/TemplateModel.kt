package com.example.kopringcore.model

import javax.persistence.*

@Entity
@Table(name = "template_model")
class TemplateModel(
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    val id: Int? = null,
    val content: String? = "",
    val templateName: String? = ""
)
