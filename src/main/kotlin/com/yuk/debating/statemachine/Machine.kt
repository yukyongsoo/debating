package com.yuk.debating.statemachine

class Machine(
    val id: Int
) {
    var state: State = None
        private set

    fun next() {
        state = state.next()
    }

    fun prev() {
        state = state.prev()
    }
}