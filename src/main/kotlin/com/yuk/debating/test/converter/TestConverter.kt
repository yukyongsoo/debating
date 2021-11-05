package com.yuk.debating.test.converter

import com.yuk.debating.test.inbound.TestResponse
import com.yuk.debating.test.outbound.TestEntity
import org.mapstruct.Mapper

@Mapper(componentModel = "spring")
@JvmDefaultWithoutCompatibility
interface TestConverter {
    fun toResponse(test: TestEntity): TestResponse {
        return TestResponse(test.id, test.testColumn)
    }
}