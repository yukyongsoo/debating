package com.yuk.debating.test2.inbound

import com.yuk.debating.test2.service.Test2Service
import org.springframework.web.bind.annotation.*
import reactor.core.publisher.Mono


@RestController
@RequestMapping("/test2")
class Test2Controller(
    private val test2Service: Test2Service
) {
    @GetMapping
    fun get(): Mono<Test2Response> {
        return test2Service.get()
    }

    @PostMapping
    fun create() {
        test2Service.create()
    }

    @PutMapping
    fun update() {
        test2Service.update()
    }

    @DeleteMapping
    fun delete() {
        test2Service.delete()
    }
}