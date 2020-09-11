package com.zmints.helloKotlin2.helloKotlin2

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class HelloKotlin2Application

fun main(args: Array<String>) {
	runApplication<HelloKotlin2Application>(*args)
}
