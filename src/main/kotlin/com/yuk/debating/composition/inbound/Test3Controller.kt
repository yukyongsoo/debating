package com.yuk.debating.composition.inbound

import com.yuk.debating.composition.Test3Service
import com.yuk.debating.composition.domain.Test3Domain
import com.yuk.debating.inheritence.inbound.TestResponse
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/test3")
class Test3Controller(
    private val test3Service: Test3Service
) {
    @GetMapping
    fun get(): Test3Domain {
        return test3Service.read()
    }

    @PostMapping
    fun add() {
        test3Service.write()
    }

    @PutMapping
    fun update() {
        test3Service.update(1, "bbb")
    }

    @DeleteMapping
    fun delete() {
        test3Service.delete()
    }

}