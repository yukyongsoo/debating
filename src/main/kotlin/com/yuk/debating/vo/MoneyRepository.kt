package com.yuk.debating.vo

import org.springframework.data.jpa.repository.JpaRepository

// generic not supported
interface MoneyRepository : JpaRepository<MoneyEntity, Long>