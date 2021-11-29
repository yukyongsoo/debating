package com.yuk.debating.test2.converter

import com.yuk.debating.test2.domain.Test2
import com.yuk.debating.test2.outbound.Test2Entity
import org.mapstruct.Mapper
import org.mapstruct.Mapping
import org.mapstruct.ReportingPolicy

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.ERROR)
interface Test2Converter {
    fun toTest(test2Entity: Test2Entity): Test2

    fun toEntity(test2: Test2): Test2Entity
}