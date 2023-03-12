package com.tildiary.tildiary

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.data.jpa.repository.config.EnableJpaAuditing

@SpringBootApplication
@EnableJpaAuditing
class TildiaryApplication

fun main(args: Array<String>) {
    runApplication<TildiaryApplication>(*args)
}
