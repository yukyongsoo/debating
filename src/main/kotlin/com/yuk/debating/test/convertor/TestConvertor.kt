package com.yuk.debating.test.convertor

import com.yuk.debating.test.domain.Test
import com.yuk.debating.test.infra.TestEntity
import org.mapstruct.Mapper

@Mapper(componentModel = "spring")
interface TestConvertor {
    fun toEntity(test: Test): TestEntity
    fun toTest(testEntity: TestEntity): Test {
        return Test(testEntity.testColumn)
    }
}