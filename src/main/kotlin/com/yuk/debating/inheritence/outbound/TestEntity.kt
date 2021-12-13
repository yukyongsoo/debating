package com.yuk.debating.inheritence.outbound

import com.yuk.debating.inheritence.domain.Test
import javax.persistence.*

@Entity
@Table(name = "test")
class TestEntity(
    testColumn: String
) : Test() {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    override var id: Long = 0

    @Column(name = "test_column")
    override var testColumn: String = ""

    init {
        this.testColumn = testColumn
    }
}