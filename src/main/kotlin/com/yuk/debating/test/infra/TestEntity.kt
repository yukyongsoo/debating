package com.yuk.debating.test.infra

import javax.persistence.*

@Entity
@Table(name = "test")
class TestEntity(
    testInput: String
) {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long = 0

    @Column(name = "test_column")
    var testColumn: String = ""
        protected set

    init {
        this.testColumn = testInput
    }
}