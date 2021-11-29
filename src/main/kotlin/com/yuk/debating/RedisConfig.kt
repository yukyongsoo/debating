//package com.yuk.debating
//
//import org.springframework.beans.factory.annotation.Value
//import org.springframework.context.annotation.Bean
//import org.springframework.context.annotation.Configuration
//import org.springframework.data.redis.connection.RedisConnectionFactory
//import org.springframework.data.redis.connection.RedisStandaloneConfiguration
//import org.springframework.data.redis.connection.lettuce.LettuceClientConfiguration
//import org.springframework.data.redis.connection.lettuce.LettuceConnectionFactory
//import java.time.Duration
//
//
//@Configuration
//class RedisConfig {
//
//    @Bean
//    fun getRedisConfig(
//        @Value("\${spring.redis.host}") hostName: String,
//        @Value("\${spring.redis.port}") port: Int
//    ): RedisConnectionFactory {
//        val redisStandaloneConfiguration = RedisStandaloneConfiguration(hostName, port)
//
//        val clientConfig = LettuceClientConfiguration.builder()
//            .commandTimeout(Duration.ofMillis(500))
//            .shutdownTimeout(Duration.ofMillis(500))
//            .build()
//
//        return LettuceConnectionFactory(redisStandaloneConfiguration, clientConfig)
//    }
//}