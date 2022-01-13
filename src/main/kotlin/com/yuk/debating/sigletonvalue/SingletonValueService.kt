package com.yuk.debating.sigletonvalue

import org.springframework.stereotype.Service
import javax.annotation.PostConstruct

@Service
class SingletonValueService {
    @PostConstruct
    fun init() {
        NotBean().print()
    }
}