package com.yuk.debating.vo

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController


@RestController
@RequestMapping("/money")
class MoneyController(
    private val moneyRepository: MoneyRepository
) {
    @GetMapping
    fun get(): Money {
        return Money(1)
    }

    @GetMapping("/{moneyId}")
    fun getById(@PathVariable moneyId: MoneyId): Money {
        val entity = moneyRepository.findById(moneyId.value)

        return entity.get().money
    }

    @PostMapping
    fun post(@RequestBody money: Money) {
        val entity = MoneyEntity(money)

        moneyRepository.save(entity)
    }
}