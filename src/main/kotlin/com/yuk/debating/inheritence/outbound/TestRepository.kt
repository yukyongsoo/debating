package com.yuk.debating.inheritence.outbound

import org.springframework.data.jpa.repository.JpaRepository

interface TestRepository: JpaRepository<TestEntity, Long>