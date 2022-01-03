package com.yuk.debating.visibility

import com.yuk.debating.visibility.outbound.Test5InnerService
import org.springframework.stereotype.Service

@Service
class Test5Service(
    private val test5InnerService: Test5InnerService
) {
    fun test() {
       test5InnerService.print()
    }
}