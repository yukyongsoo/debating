package com.yuk.debating.visibility.outbound;

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.context.annotation.Lazy
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Service

@Service
class Test5InnerService {
    protected interface Product2EntityRepository : JpaRepository<Product2Entity, Long>

    @Autowired
    @Lazy
    private lateinit var product2EntityRepository: Product2EntityRepository

    fun print(): Product2Entity? {
        return product2EntityRepository.findByIdOrNull(1)
    }
}