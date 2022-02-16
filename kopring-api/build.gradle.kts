//import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    id("org.springframework.boot") version "2.6.3"
    id("io.spring.dependency-management") version "1.0.11.RELEASE"
    kotlin("jvm") version "1.6.10"
    kotlin("plugin.spring") version "1.6.10"
    kotlin("plugin.jpa") version "1.6.10"
}


configurations {
    all {
        exclude(group = "org.springframework.boot", module = "spring-boot-starter-logging")
    }
}

dependencies{
    implementation (project(":kopring-core"))
    implementation ("org.bgee.log4jdbc-log4j2:log4jdbc-log4j2-jdbc4.1:1.16")
    implementation ("org.mariadb.jdbc:mariadb-java-client:2.6.2")
    implementation("io.pebbletemplates:pebble-spring-boot-starter:3.1.5")
    implementation("org.springframework.boot:spring-boot-starter")
}