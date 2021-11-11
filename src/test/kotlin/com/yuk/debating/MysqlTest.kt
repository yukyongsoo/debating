package com.yuk.debating

import com.yuk.debating.test.outbound.TestRepository
import com.yuk.debating.test2.outbound.Test2Repository
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.DynamicPropertyRegistry
import org.springframework.test.context.DynamicPropertySource
import org.testcontainers.containers.MySQLContainer
import org.testcontainers.junit.jupiter.Container
import org.testcontainers.junit.jupiter.Testcontainers
import org.testcontainers.utility.DockerImageName

@Testcontainers
@DataJpaTest
class MysqlTest {
    @Autowired
    lateinit var testRepository: TestRepository

    @Autowired
    lateinit var test2Repository: Test2Repository

    companion object {
        @Container
        @JvmStatic
        val dbContainer = MySQLContainer<Nothing>(DockerImageName.parse("mysql"))

        @JvmStatic
        @DynamicPropertySource
        fun redisProperties(registry: DynamicPropertyRegistry) {
            //registry.add("spring.redis.host", dbContainer::getContainerIpAddress)
        }
    }

    @Test
    fun init() {

    }
}