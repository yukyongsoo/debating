package com.yuk.debating.inheritence.converter

import com.yuk.debating.inheritence.inbound.TestResponse
import com.yuk.debating.inheritence.outbound.TestEntity
import org.mapstruct.Mapper
import org.mapstruct.ReportingPolicy

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.ERROR)
@JvmDefaultWithoutCompatibility
interface TestConverter {
    fun toResponse(test: TestEntity): TestResponse {
        return TestResponse(test.id, test.testColumn)
    }
}