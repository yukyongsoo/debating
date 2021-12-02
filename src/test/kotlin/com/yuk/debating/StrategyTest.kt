package com.yuk.debating

import com.yuk.debating.test3.Test3Service
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class StrategyTest {
    @Autowired
    private lateinit var test3Service: Test3Service

    @Test
    fun test() {
        test3Service.test()
    }
}