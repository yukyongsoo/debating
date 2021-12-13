package com.yuk.debating.strategy

import org.springframework.stereotype.Service

@Service
class StrategyService(
    private val serviceFactory: ServiceFactory
) {
    fun test() {
        serviceFactory.get("t1").test()

        serviceFactory.get("t2").test()
    }

}