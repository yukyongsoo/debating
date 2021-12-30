package com.yuk.debating.statemachine

sealed interface State {
    fun next(): State
    fun prev(): State
    fun data(): String
}

object None: State {
    override fun next(): State {
        return State2()
    }

    override fun prev(): State {
        return this
    }

    override fun data(): String {
        return "NONE"
    }
}

class State2: State {
    private val data = "State2"

    override fun next(): State {
        return State3()
    }

    override fun prev(): State {
        return None
    }

    override fun data(): String {
        return data
    }
}

class State3: State {
    private val data = "State3"

    override fun next(): State {
        return this
    }

    override fun prev(): State {
        return State2()
    }

    override fun data(): String {
        return data
    }
}