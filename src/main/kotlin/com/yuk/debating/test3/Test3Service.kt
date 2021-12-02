package com.yuk.debating.test3

import org.springframework.stereotype.Service

@Service
class Test3Service(
    private val test3Factory: Test3Factory
) {
    fun test() {
        test3Factory.get("t1").test()

        test3Factory.get("t2").test()
    }

}