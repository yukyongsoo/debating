package com.yuk.debating.inheritence

import com.yuk.debating.inheritence.converter.TestConverter
import com.yuk.debating.inheritence.outbound.TestRepository
import com.yuk.debating.inheritence.inbound.TestResponse
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