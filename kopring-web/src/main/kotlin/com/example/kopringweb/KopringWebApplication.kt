package com.example.kopring.web

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.data.jpa.repository.config.EnableJpaAuditing

@SpringBootApplication(scanBasePackages = ["com.example.kopring.core"])
@EnableJpaAuditing
class KopringWebApplication

fun main(args: Array<String>) {
	runApplication<KopringWebApplication>(*args)
}



// 코드를 수정합니다.

