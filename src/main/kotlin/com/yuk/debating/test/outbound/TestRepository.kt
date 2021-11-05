package com.yuk.debating.test.outbound

import org.springframework.data.jpa.repository.JpaRepository

interface TestRepository: JpaRepository<TestEntity, Long>