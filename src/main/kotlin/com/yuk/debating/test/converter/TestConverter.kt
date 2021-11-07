package com.yuk.debating.test.converter

import com.yuk.debating.test.inbound.TestResponse
import com.yuk.debating.test.outbound.TestEntity
import org.mapstruct.Mapper
import org.mapstruct.ReportingPolicy

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.ERROR)
@JvmDefaultWithoutCompatibility
interface TestConverter {
    fun toResponse(test: TestEntity): TestResponse {
        return TestResponse(test.id, test.testColumn)
    }
}