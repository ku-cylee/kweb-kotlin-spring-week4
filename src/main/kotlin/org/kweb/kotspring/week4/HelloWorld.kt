package org.kweb.kotspring.week4

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/hello")
class HelloWorld {
    @GetMapping
    fun helloWorld(): String = "Hello, this is a REST endpoint!"
}
