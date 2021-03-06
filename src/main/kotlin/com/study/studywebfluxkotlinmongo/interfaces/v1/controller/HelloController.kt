package com.study.studywebfluxkotlinmongo.interfaces.v1.controller

import com.study.studywebfluxkotlinmongo.interfaces.v1.dto.GetHelloDTO
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import reactor.core.publisher.Mono

@RequestMapping("/v1/hello")
@RestController
class HelloController {
    @GetMapping
    fun getHelloWorld(): Mono<GetHelloDTO> {
        return Mono.just(GetHelloDTO(1, "Hello world!"))
    }
}