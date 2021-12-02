package com.yuk.debating.test3

import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.stereotype.Service

@Service
@Qualifier("t1")
class Test3Imp2: Test3 {
    override fun test() {
        println("1111")
    }
}