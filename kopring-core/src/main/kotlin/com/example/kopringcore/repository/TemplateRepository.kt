package com.example.kopringcore.repository

//import org.springframework.data.repository.*
import org.springframework.data.jpa.repository.JpaRepository
import com.example.kopringcore.model.TemplateModel
import org.springframework.stereotype.Repository

@Repository
interface TemplateRepository : JpaRepository<TemplateModel, Long> {

    fun findByTemplateName(templateName: String): TemplateModel?

    fun findById(id: Int): TemplateModel?

    fun findAllBy(): List<TemplateModel>?
}
