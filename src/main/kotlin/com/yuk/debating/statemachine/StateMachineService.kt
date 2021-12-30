package com.yuk.debating.statemachine

import org.springframework.stereotype.Service

@Service
class StateMachineService{
    fun transition() {
        val machine = Machine(1)
        println(machine.state.data())

        machine.next()
        println(machine.state.data())

        machine.prev()
        println(machine.state.data())

        machine.next()
        println(machine.state.data())

        machine.next()
        println(machine.state.data())
    }
}