package com.yuk.debating.test.outbound

import com.yuk.debating.test.outbound.TestEntity
import org.springframework.data.jpa.repository.JpaRepository

interface TestRepository: JpaRepository<TestEntity, Long>