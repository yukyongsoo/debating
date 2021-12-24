package com.yuk.debating.state.outbound

import com.yuk.debating.state.domain.State
import javax.persistence.Column
import javax.persistence.Convert
import javax.persistence.Entity
import javax.persistence.Enumerated
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "test")
class ProductEntity(
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