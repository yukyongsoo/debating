package com.yuk.debating

import com.yuk.debating.test.inbound.TestController
import com.yuk.debating.test.inbound.TestResponse
import com.yuk.debating.test.service.TestReadService
import com.yuk.debating.test.service.TestWriteService
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.reactive.WebFluxTest
import org.springframework.boot.test.mock.mockito.MockBean
import org.springframework.context.annotation.ComponentScan
import org.springframework.context.annotation.FilterType
import org.springframework.test.web.reactive.server.WebTestClient
import reactor.test.StepVerifier

@WebFluxTest(TestController::class, excludeFilters = [
    ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE, classes = [WebConfig::class])
])
class TestRequestTest {
    @Autowired
    private lateinit var webclient: WebTestClient

    @MockBean
    private lateinit var testWriteService: TestWriteService

    @MockBean
    private lateinit var testReadService: TestReadService

    @Test
    fun test() {
        webclient.get().uri("/test")
            .exchange()
            .expectStatus().isOk
            .expectBody(TestResponse::class.java)
    }
}