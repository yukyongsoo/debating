package com.yuk.debating.strategy

import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.stereotype.Service

@Service
@Qualifier("strategy2")
class StrategyImpl2: Strategy {
    override fun test() {
        println("1111")
    }
}