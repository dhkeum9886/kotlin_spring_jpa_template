//package com.example.kopringweb.config
//import com.zaxxer.hikari.HikariDataSource
//import org.springframework.boot.autoconfigure.domain.EntityScan
//import org.springframework.boot.context.properties.ConfigurationProperties
//import org.springframework.boot.jdbc.DataSourceBuilder
//import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder
//import org.springframework.context.annotation.Configuration
//import org.springframework.data.jpa.repository.config.EnableJpaAuditing
//import org.springframework.data.jpa.repository.config.EnableJpaRepositories
//import org.springframework.transaction.annotation.EnableTransactionManagement
//import org.springframework.context.annotation.*
//import org.springframework.orm.jpa.JpaTransactionManager
//import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean
//import javax.sql.DataSource
//
//
//@Configuration
//@EnableTransactionManagement
//@EnableJpaAuditing
//@EntityScan(basePackages = ["com.example.kopringcore.model"])
//@EnableJpaRepositories(basePackages = ["com.example.kopringcore.repository"])
//class DatabaseConfig {
//    @Primary
//    @Bean
//    @ConfigurationProperties("spring.datasource.firstdb")
//    fun dataSource(): DataSource {
//        val dataSource = DataSourceBuilder.create().type(HikariDataSource::class.java).build()
//
//        // UTF-8
//        dataSource.connectionInitSql = "SET NAMES utf8mb4"
//
//        return dataSource
//    }
//
//    @Primary
//    @Bean
//    fun entityManagerFactory(
//        builder: EntityManagerFactoryBuilder
//    ): LocalContainerEntityManagerFactoryBean {
//        return builder
//            .dataSource(this.dataSource())
//            .packages("com.example.kopringweb")
//            .persistenceUnit("firstdb")
//            .build()
//    }
//
//    @Primary
//    @Bean
//    fun transactionManager(builder: EntityManagerFactoryBuilder): JpaTransactionManager {
//        return JpaTransactionManager(entityManagerFactory(builder).`object`!!)
//    }
//}