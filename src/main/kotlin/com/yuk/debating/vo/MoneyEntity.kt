package com.yuk.debating.vo

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "money")
class MoneyEntity(
    @Column(name = "money")
    val money: Money
) {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: MoneyId = MoneyId.EMPTY
}