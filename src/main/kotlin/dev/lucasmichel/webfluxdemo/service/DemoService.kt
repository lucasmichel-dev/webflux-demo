package dev.lucasmichel.webfluxdemo.service

import dev.lucasmichel.webfluxdemo.controller.dto.DemoRequest
import dev.lucasmichel.webfluxdemo.controller.dto.DemoResponse
import dev.lucasmichel.webfluxdemo.controller.validator.DemoValidator
import dev.lucasmichel.webfluxdemo.feign.FeignClient
import org.springframework.stereotype.Service
import reactor.core.publisher.Mono
import reactor.kotlin.core.publisher.toMono

@Service
class DemoService(
    val validator: DemoValidator,
    val feignClient: FeignClient
) {

    fun read(): Mono<DemoResponse> {

        return DemoResponse("test").toMono()
    }

    fun create(request: DemoRequest): Mono<DemoResponse> {

        return DemoValidator.validateRequest(request)
    }

    fun feignHome(): Mono<String> = feignClient.home()

    fun feignAbout(): Mono<String> = feignClient.about()
}