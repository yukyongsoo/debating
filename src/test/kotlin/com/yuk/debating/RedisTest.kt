package com.yuk.debating

import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.data.redis.core.StringRedisTemplate
// import org.springframework.data.redis.core.StringRedisTemplate
import org.springframework.test.context.DynamicPropertyRegistry
import org.springframework.test.context.DynamicPropertySource
import org.testcontainers.containers.GenericContainer
import org.testcontainers.junit.jupiter.Container
import org.testcontainers.junit.jupiter.Testcontainers
import org.testcontainers.utility.DockerImageName


@Testcontainers
@SpringBootTest
class RedisTest {
    @Autowired
    lateinit var redisTemplate: StringRedisTemplate

    companion object {
        @Container
        @JvmStatic
        val redisContainer =
            object : GenericContainer<Nothing>(DockerImageName.parse("redis")) {
                init {
                    withExposedPorts(6379)
                }
            }

        @JvmStatic
        @DynamicPropertySource
        fun redisProperties(registry: DynamicPropertyRegistry) {
            registry.add(
                "spring.redis.host",
                redisContainer::getContainerIpAddress
            )
            registry.add(
                "spring.redis.port",
                redisContainer::getFirstMappedPort
            )
        }
    }

    @Test
    fun test() {
        redisTemplate.opsForValue().set("asdf", "asdfasdf")
    }

    @Test
    fun test2() {
        redisTemplate.opsForValue().set("asdf", "asdfasdf")
    }
}
