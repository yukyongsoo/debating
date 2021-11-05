package com.yuk.debating.test.service

import com.yuk.debating.test.converter.TestConverter
import com.yuk.debating.test.outbound.TestRepository
import com.yuk.debating.test.inbound.TestResponse
import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
@Transactional(readOnly = true)
class TestReadService(
        private val testRepository: TestRepository,
        private val testConverter: TestConverter
) {
    fun read(): TestResponse {
        val test = testRepository.findByIdOrNull(1)
            ?: throw RuntimeException()

        return testConverter.toResponse(test)
    }
}