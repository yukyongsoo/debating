package com.yuk.debating.test.domain

import com.yuk.debating.test.infra.TestEntity
import org.springframework.data.jpa.repository.JpaRepository

interface TestRepository: JpaRepository<TestEntity, Long>