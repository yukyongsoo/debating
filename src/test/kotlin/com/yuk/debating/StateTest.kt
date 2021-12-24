package com.yuk.debating

import com.yuk.debating.state.StateService
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class StateTest {
    @Autowired
    private lateinit var stateService: StateService

    @Test
    fun test() {
        stateService.stateWork()
    }
}
