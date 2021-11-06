package com.yuk.debating.test.inbound

import com.yuk.debating.test.service.TestReadService
import com.yuk.debating.test.service.TestWriteService
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/test")
class TestController(
    private val testWriteService: TestWriteService,
    private val testReadService: TestReadService
) {
    @GetMapping
    fun get(): TestResponse {
        return testReadService.read()
    }

    @PostMapping
    fun add() {
        testWriteService.write()
    }

    @PutMapping
    fun update() {
        testWriteService.update(1, "bbb")
    }

    @DeleteMapping
    fun delete() {
        testWriteService.delete()
    }
}