package com.yuk.debating.vo

import java.io.Serializable

@JvmInline
value class MoneyId(
    val value: Long
): Serializable {
    companion object {
        val EMPTY = MoneyId(0)
    }
}