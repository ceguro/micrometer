package com.example.micrometer.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class Test {

    @GetMapping("/message")
    fun getMessage(): String {
        return "Hello World!"
    }

}