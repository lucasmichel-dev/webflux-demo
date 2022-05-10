package dev.lucasmichel.webfluxdemo.controller.validator

import dev.lucasmichel.webfluxdemo.controller.dto.DemoRequest
import dev.lucasmichel.webfluxdemo.controller.dto.DemoResponse
import dev.lucasmichel.webfluxdemo.controller.exception.DemoException
import org.springframework.stereotype.Component
import reactor.core.publisher.Mono

@Component
object DemoValidator {

    fun validateRequest(request: DemoRequest): Mono<DemoResponse> {

        return ageValidator(request.age)
    }

    private fun ageValidator(age: Int): Mono<DemoResponse> {
        return if (age > 25)
            Mono.error(DemoException("Forbidden age!"))
        else
            Mono.just(DemoResponse("Allowed age!"))
    }

}