package com.example.kopringweb.service

import com.example.kopringcore.model.TemplateModel
import com.example.kopringcore.repository.TemplateRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import javax.transaction.Transactional

@Service
class TemplateServiceImpl constructor(@Autowired private val templateRepository: TemplateRepository ) : TemplateService {

    override fun getAllTemplates(): List<TemplateModel>? =
        templateRepository.findAllBy()

    override fun getTemplate(idx: Int): TemplateModel? {
        return templateRepository.findById(idx)
    }

    override fun getTemplateByName(name: String): TemplateModel? {
        return templateRepository.findByTemplateName(name)
    }

    @Transactional
    override fun saveTemplate(templateModel: TemplateModel): TemplateModel =
        templateRepository.save(templateModel)

}