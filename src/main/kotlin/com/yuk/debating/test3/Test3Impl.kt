package com.yuk.debating.test3

import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.stereotype.Service

@Service
@Qualifier("t2")
class Test3Impl: Test3 {
    override fun test() {
        println("222")
    }
}