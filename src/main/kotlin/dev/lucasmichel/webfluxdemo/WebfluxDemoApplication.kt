package dev.lucasmichel.webfluxdemo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.web.reactive.config.EnableWebFlux
import reactivefeign.spring.config.EnableReactiveFeignClients

@SpringBootApplication
@EnableWebFlux
@EnableReactiveFeignClients
class WebfluxDemoApplication

fun main(args: Array<String>) {
	runApplication<WebfluxDemoApplication>(*args)
}
