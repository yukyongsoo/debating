package com.yuk.debating.test.inbound

import com.yuk.debating.test.service.TestReadService
import com.yuk.debating.test.service.TestWriteService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/test")
class TestController(
    private val testWriteService: TestWriteService,
    private val testReadService: TestReadService
) {
    @GetMapping
    fun get() {
        testReadService.read()
    }

    @PostMapping
    fun add() {
        testWriteService.write()
    }
}