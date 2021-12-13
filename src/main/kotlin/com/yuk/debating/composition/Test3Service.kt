package com.yuk.debating.composition

import com.yuk.debating.composition.domain.Test3Domain
import com.yuk.debating.composition.outbound.Test3Repository
import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
@Transactional
class Test3Service(
    private val test3Repository: Test3Repository
) {
    fun read(): Test3Domain {
        val entity = test3Repository.findByIdOrNull(1) ?: throw RuntimeException()
        val domain = Test3Domain(entity)

        return domain
    }

    fun write() {
        val domain = Test3Domain("asdf")

        test3Repository.save(domain.createEntity())
    }

    fun update(id: Int, name: String) {
        val entity = test3Repository.findByIdOrNull(1) ?: throw RuntimeException()
        val domain = Test3Domain(entity)

        domain.update()
    }

    fun delete() {
        val entity = test3Repository.findByIdOrNull(1)  ?: throw RuntimeException()

        test3Repository.delete(entity)
    }
}