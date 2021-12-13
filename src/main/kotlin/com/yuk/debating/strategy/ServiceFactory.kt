package com.yuk.debating.strategy

import org.springframework.stereotype.Service

@Service
class ServiceFactory(
    strategyImpl: StrategyImpl,
    strategyImpl2: StrategyImpl2
) {
    private val serviceMap: Map<String, Strategy> = mapOf(
        "strategy1" to strategyImpl,
        "strategy2" to strategyImpl2
    )

    fun get(type: String): Strategy {
        return serviceMap[type]
            ?: throw RuntimeException()
    }
}