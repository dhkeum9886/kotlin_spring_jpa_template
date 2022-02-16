package com.example.kopring.core.repository

import com.example.kopring.core.model.Answer
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Component
import org.springframework.stereotype.Repository

@Repository
@Component
interface AnswerRepository: JpaRepository<Answer, Long> {
    fun findByQuestionId(questionId: Long): List<Answer>
}