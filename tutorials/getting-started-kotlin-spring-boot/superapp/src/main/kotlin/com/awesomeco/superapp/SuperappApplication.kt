package com.awesomeco.superapp

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SuperappApplication

fun main(args: Array<String>) {
	runApplication<SuperappApplication>(*args)
}
