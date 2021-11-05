package com.yuk.debating.test.converter

import com.yuk.debating.test.domain.Test
import com.yuk.debating.test.inbound.TestResponse
import com.yuk.debating.test.outbound.TestEntity
import org.mapstruct.Mapper

@Mapper(componentModel = "spring")
interface TestConverter {
    fun toEntity(test: Test): TestEntity
    fun toTest(testEntity: TestEntity): Test
    fun toResponse(testEntity: TestEntity): TestResponse
}