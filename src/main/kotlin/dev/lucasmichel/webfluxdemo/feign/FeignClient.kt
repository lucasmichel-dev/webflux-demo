package dev.lucasmichel.webfluxdemo.feign

import org.springframework.stereotype.Component
import org.springframework.web.bind.annotation.GetMapping
import reactivefeign.spring.config.ReactiveFeignClient
import reactor.core.publisher.Mono

@Component
@ReactiveFeignClient(url = "http://localhost:3000", name = "client")
interface FeignClient {

    @GetMapping(value = ["/"])
    fun home(): Mono<String>

    @GetMapping(value = ["/about"])
    fun about(): Mono<String>
}