package com.yuk.debating.test.service

import com.yuk.debating.test.convertor.TestDtoConvertor
import com.yuk.debating.test.domain.TestRepository
import com.yuk.debating.test.inbound.TestResponse
import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
@Transactional(readOnly = true)
class TestReadService(
    private val testRepository: TestRepository,
    private val testDtoConvertor: TestDtoConvertor
) {
    fun read(): TestResponse {
        val entity = testRepository.findByIdOrNull(1)
            ?: throw Exception()

        return testDtoConvertor.toResponse(entity)
    }
}