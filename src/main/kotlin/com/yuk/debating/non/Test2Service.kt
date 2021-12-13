package com.yuk.debating.non

import com.yuk.debating.non.converter.Test2Converter
import com.yuk.debating.non.domain.Test2
import com.yuk.debating.non.external.TestClient
import com.yuk.debating.non.inbound.Test2Response
import com.yuk.debating.non.outbound.Test2Repository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.reactor.mono
import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional
import reactor.core.publisher.Mono

@Service
@Transactional
class Test2Service(
    private val test2Repository: Test2Repository,
    private val test2Converter: Test2Converter,
    private val testClient: TestClient
) {
    fun get(): Mono<Test2Response> {
        return mono(Dispatchers.IO) {
            val test = testClient.getTest()

            val test2Entity = test2Repository.findByIdOrNull(1)
                ?: throw RuntimeException()
            val test2 = test2Converter.toTest(test2Entity)

            Test2Response(test2, test)
        }
    }

    fun create() {
        val test2 = Test2("bbbb")
        val entity = test2Converter.toEntity(test2)

        test2Repository.save(entity)
    }

    fun update() {
        val test2Entity = test2Repository.findByIdOrNull(1)
            ?: throw RuntimeException()
        val domain = test2Converter.toTest(test2Entity)

        domain.update()

        test2Entity.update()
    }

    fun delete() {
        val test2Entity = test2Repository.findByIdOrNull(1)
            ?: throw RuntimeException()

        test2Repository.delete(test2Entity)
    }
}