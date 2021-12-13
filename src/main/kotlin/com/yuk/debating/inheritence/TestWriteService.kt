package com.yuk.debating.inheritence

import com.yuk.debating.inheritence.outbound.TestEntity
import com.yuk.debating.inheritence.outbound.TestRepository
import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
@Transactional
class TestWriteService(
    private val testRepository: TestRepository
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