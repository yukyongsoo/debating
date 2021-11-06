package com.yuk.debating.test2.inbound

import com.yuk.debating.test2.service.Test2Service
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController


@RestController
@RequestMapping("/test2")
class Test2Controller(
    private val test2Service: Test2Service
) {
    @GetMapping
    fun get(): Test2Response {
        return test2Service.get()
    }
}