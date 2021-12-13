package com.yuk.debating

import com.yuk.debating.strategy.StrategyService
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class StrategyTest {
    @Autowired
    private lateinit var strategyService: StrategyService

    @Test
    fun test() {
        strategyService.test()
    }
}