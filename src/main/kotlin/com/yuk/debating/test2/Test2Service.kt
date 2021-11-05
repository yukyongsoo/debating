package com.yuk.debating.test2

import com.yuk.debating.test.service.TestReadService
import org.springframework.stereotype.Service

@Service
class Test2Service(
        private val testReadService: TestReadService
) {
    fun a() {
        testReadService.read()

    }
}