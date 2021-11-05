package com.yuk.debating.test.service

import com.yuk.debating.test.converter.TestConverter
import com.yuk.debating.test.domain.Test
import com.yuk.debating.test.outbound.TestEntity
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
        val test = TestEntity("aaa")
        testRepository.save(test)
    }

    fun update(id: Int, column: String) {
        val test = testRepository.findByIdOrNull(1) ?: throw RuntimeException()
        test.updateColumn()
    }

    fun delete() {
        val entity = testRepository.findByIdOrNull(1) ?: throw RuntimeException()
        testRepository.delete(entity)
    }
}