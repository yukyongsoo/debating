package com.yuk.debating

import com.yuk.debating.statemachine.StateMachineService
import org.junit.jupiter.api.Test

class StateMachineTest {
    @Test
    fun test() {
        val stateMachineService = StateMachineService()
        stateMachineService.transition()
    }
}