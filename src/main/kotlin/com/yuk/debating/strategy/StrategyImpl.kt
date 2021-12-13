package com.yuk.debating.strategy

import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.stereotype.Service

@Service
@Qualifier("strategy1")
class StrategyImpl: Strategy {
    override fun test() {
        println("222")
    }
}