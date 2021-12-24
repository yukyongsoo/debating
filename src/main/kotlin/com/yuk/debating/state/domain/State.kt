package com.yuk.debating.state.domain

//replace possible interface
enum class State {
    STOCKOUT {
        override fun postWork() {
            println("STOCK OUT")
        }
    },
    STOCKIN {
        override fun postWork() {
            println("STOCK IN")
        }
    };

    abstract fun postWork()
}
