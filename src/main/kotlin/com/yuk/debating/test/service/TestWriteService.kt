package com.yuk.debating.test.service

import com.yuk.debating.test.converter.TestConverter
import com.yuk.debating.test.domain.Test
import com.yuk.debating.test.outbound.TestRepository
import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
@Transactional
class TestWriteService(
        private val testRepository: TestRepository,
        private val testConverter: TestConverter
) {
    fun write() {
        val test = Test("aaa")
        val entity = testConverter.toEntity(test)
        testRepository.save(entity)
    }

    fun update() {
        val entity = testRepository.findByIdOrNull(1) ?: throw Exception()
        val test = testConverter.toTest(entity)
        test.updateColumn()
        entity.updateColumn()
    }

    fun delete() {
        val entity = testRepository.findByIdOrNull(1) ?: throw Exception()
        testRepository.delete(entity)
    }
}