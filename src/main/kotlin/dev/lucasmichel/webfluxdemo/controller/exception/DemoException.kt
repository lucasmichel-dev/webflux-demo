package dev.lucasmichel.webfluxdemo.controller.exception

import java.lang.RuntimeException

class DemoException(
        msg: String
): RuntimeException(msg)