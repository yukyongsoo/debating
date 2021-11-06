package com.yuk.debating.test2.converter

import com.yuk.debating.test2.domain.Test2
import com.yuk.debating.test2.outbound.Test2Entity
import org.mapstruct.Mapper

@Mapper(componentModel = "spring")
interface Test2Converter {
    fun toTest(test2Entity: Test2Entity): Test2
}