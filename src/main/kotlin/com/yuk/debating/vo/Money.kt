package com.yuk.debating.vo

@JvmInline
value class Money(
    val value: Long
) {
    companion object {
        val ZERO = Money(0)
    }

    operator fun plus(money: Money): Money {
        return Money(this.value + money.value)
    }

    operator fun compareTo(money: Money): Int {
        return this.value.compareTo(money.value)
    }
}