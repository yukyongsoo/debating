package com.yuk.debating

import com.yuk.debating.test2.service.Test2Service
import org.springframework.context.annotation.Configuration
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer

@Configuration
class WebConfig(
    private val test2Service: Test2Service
): WebMvcConfigurer {
}