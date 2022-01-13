package com.yuk.debating.sigletonvalue

import org.springframework.beans.factory.annotation.Value
import org.springframework.stereotype.Service

@Service
class SingletonValue(
    @Value("\${spring.redis.host}") val host: String,
    @Value("\${spring.redis.password}") val password: String,
    @Value("\${spring.redis.port}") val port: String
) {
    init {
        instance = this
    }

    companion object {
        private lateinit var instance: SingletonValue

        fun get(): SingletonValue {
            return instance
        }
    }
}