package com.yuk.debating.test.outbound

import javax.persistence.*

@Entity
@Table(name = "test")
class TestEntity(
    testColumn: String
) {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long = 0

    @Column(name = "test_column")
    var testColumn: String = ""
        protected set

    init {
        this.testColumn = testColumn
    }

    fun updateColumn() {
        this.testColumn = "bbb"
    }
}