package com.yuk.debating.vo

class Account(
    private var money: Money
) {
    fun add(money: Money) {
        val a = this.money + money

        if(this.money == Money.ZERO)
            return
    }


}