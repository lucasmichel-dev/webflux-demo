package dev.lucasmichel.webfluxdemo.controller

import dev.lucasmichel.webfluxdemo.controller.dto.DemoRequest
import dev.lucasmichel.webfluxdemo.controller.dto.DemoResponse
import dev.lucasmichel.webfluxdemo.service.DemoService
import org.springframework.web.bind.annotation.*
import reactor.core.publisher.Mono

@RestController
@RequestMapping("/demo")
class DemoController(
        val service: DemoService
) {

    @GetMapping
    fun get(): Mono<DemoResponse> {
        return service.read()
                .onErrorReturn(DemoResponse(msg = "ERRO"))
                .map { it }
    }

    @PostMapping
    fun post(@RequestBody request: DemoRequest): Mono<DemoResponse> {

        return service.create(request)
                .onErrorReturn(DemoResponse(msg = "ERRO"))
                .map { it }
    }
}