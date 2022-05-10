package dev.lucasmichel.webfluxdemo.controller.dto

import com.fasterxml.jackson.databind.PropertyNamingStrategies
import com.fasterxml.jackson.databind.annotation.JsonNaming

@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy::class)
data class DemoRequest(
        val name: String,
        val age: Int,
        val dateOfBirth: String
)
