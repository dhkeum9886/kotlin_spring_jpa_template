package com.example.kopring.core

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.data.jpa.repository.config.EnableJpaRepositories

@SpringBootApplication
class KopringCoreApplication

fun main(args: Array<String>) {
    runApplication<KopringCoreApplication>(*args)
}
