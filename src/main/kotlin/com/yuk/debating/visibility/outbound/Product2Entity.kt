package com.yuk.debating.visibility.outbound

import com.yuk.debating.state.domain.State
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Enumerated
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "product2")
class Product2Entity(
    state: State
) {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long = 0

    @Enumerated
    @Column(name = "test_column", nullable = false, columnDefinition = "TINYINT")
    lateinit var state: State
        protected set

    init {
        this.state = state
    }
}