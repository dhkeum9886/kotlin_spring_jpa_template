package com.example.kopringweb

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.data.jpa.repository.config.EnableJpaRepositories

// TODO https://techfox.tistory.com/3
// TODo https://seosh817.tistory.com/7

@SpringBootApplication
class KopringWebApplication

fun main(args: Array<String>) {
    runApplication<KopringWebApplication>(*args)
}
