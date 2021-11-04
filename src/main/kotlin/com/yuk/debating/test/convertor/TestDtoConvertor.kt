package com.yuk.debating.test.convertor

import com.yuk.debating.test.inbound.TestResponse
import com.yuk.debating.test.infra.TestEntity
import org.mapstruct.Mapper

@Mapper(componentModel = "spring")
interface TestDtoConvertor {
    fun toResponse(testEntity: TestEntity): TestResponse
}