package com.yuk.debating.test.service

import com.yuk.debating.test.convertor.TestConvertor
import com.yuk.debating.test.domain.Test
import com.yuk.debating.test.domain.TestRepository
import com.yuk.debating.test.convertor.TestDtoConvertor
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
@Transactional
class TestWriteService(
    private val testRepository: TestRepository,
    private val testConvertor: TestConvertor
) {
    fun write() {
        val test = Test("aaa")
        val entity = testConvertor.toEntity(test)
        testRepository.save(entity)
    }

    fun update() {

    }
}