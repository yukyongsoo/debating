package com.yuk.debating.non.external

import com.yuk.debating.inheritence.inbound.TestResponse
import com.yuk.debating.inheritence.TestReadService
import org.springframework.stereotype.Service

@Service
class TestClient(
    private val testReadService: TestReadService
) {
    fun getTest(): TestResponse {
        return testReadService.read()
    }
}