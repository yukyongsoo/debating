package com.yuk.debating.test3

import org.springframework.stereotype.Service

@Service
class Test3Factory(
    test3Impl: Test3Impl,
    test3Imp2: Test3Imp2
) {
    private val serviceMap: Map<String, Test3> = mapOf(
        "t1" to test3Impl,
        "t2" to test3Imp2
    )

    fun get(type: String): Test3 {
        return serviceMap[type]
            ?: throw RuntimeException()
    }
}