package com.tildiary.tildiary

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class TildiaryApplication

fun main(args: Array<String>) {
    runApplication<TildiaryApplication>(*args)
}
