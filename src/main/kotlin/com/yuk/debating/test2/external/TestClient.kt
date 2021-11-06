package com.yuk.debating.test2.external

import com.yuk.debating.test.inbound.TestResponse
import com.yuk.debating.test.service.TestReadService
import org.springframework.stereotype.Service

@Service
class TestClient(
    private val testReadService: TestReadService
) {
    fun getTest(): TestResponse {
        return testReadService.read()
    }
}