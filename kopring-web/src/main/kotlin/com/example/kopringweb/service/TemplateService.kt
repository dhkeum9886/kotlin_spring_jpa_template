package com.example.kopringweb.service

import org.springframework.stereotype.Service
import com.example.kopringcore.model.TemplateModel

@Service
interface TemplateService {

    fun getAllTemplates(): List<TemplateModel>?

    fun getTemplate(id: Int): TemplateModel?

    fun saveTemplate(templateModel: TemplateModel): TemplateModel

    fun getTemplateByName(name: String): TemplateModel?
}