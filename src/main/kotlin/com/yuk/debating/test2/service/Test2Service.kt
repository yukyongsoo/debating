package com.yuk.debating.test2.service

import com.yuk.debating.test2.converter.Test2Converter
import com.yuk.debating.test2.domain.Test2
import com.yuk.debating.test2.external.TestClient
import com.yuk.debating.test2.inbound.Test2Response
import com.yuk.debating.test2.outbound.Test2Repository
import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Service
import javax.transaction.Transactional

@Service
@Transactional
class Test2Service(
    private val test2Repository: Test2Repository,
    private val test2Converter: Test2Converter,
    private val testClient: TestClient
) {

    fun get(): Test2Response {
        val test = testClient.getTest()

        val test2Entity = test2Repository.findByIdOrNull(1)
            ?: throw RuntimeException()
        val test2 = test2Converter.toTest(test2Entity)

        return Test2Response(test2, test)
    }

    fun create() {
        val test2 = Test2("bbbb")
        val entity = test2Converter.toEntity(test2)

        test2Repository.save(entity)
    }

    fun update() {

    }

    fun delete() {
        val test2Entity = test2Repository.findByIdOrNull(1)
            ?: throw RuntimeException()

        test2Repository.delete(test2Entity)
    }
}