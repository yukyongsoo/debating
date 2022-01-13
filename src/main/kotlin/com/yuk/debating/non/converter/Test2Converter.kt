package com.yuk.debating.non.converter

import com.yuk.debating.non.domain.Test2
import com.yuk.debating.non.outbound.Test2Entity
import org.mapstruct.Mapper
import org.mapstruct.ReportingPolicy

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
interface Test2Converter {
    fun toTest(test2Entity: Test2Entity): Test2

    fun toEntity(test2: Test2): Test2Entity
}