package com.yuk.debating.inheritence.inbound

import com.yuk.debating.inheritence.TestReadService
import com.yuk.debating.inheritence.TestWriteService
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