package com.yuk.debating

import io.lettuce.core.ClientOptions
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.data.redis.connection.RedisConnectionFactory
import org.springframework.data.redis.connection.RedisStandaloneConfiguration
import org.springframework.data.redis.connection.lettuce.LettuceClientConfiguration
import org.springframework.data.redis.connection.lettuce.LettuceConnectionFactory


@Configuration
class RedisConfig {

    @Bean
    fun getRedisConfig(): RedisConnectionFactory {
        val redisStandaloneConfiguration = RedisStandaloneConfiguration()

        val clientOptions = ClientOptions.builder()
            .autoReconnect(false)
            .build()

        val clientConfig = LettuceClientConfiguration.builder()
            .clientOptions(clientOptions)
            .build()

        return LettuceConnectionFactory(redisStandaloneConfiguration, clientConfig)
    }
}