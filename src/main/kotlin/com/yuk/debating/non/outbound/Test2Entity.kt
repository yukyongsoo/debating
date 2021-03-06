package com.yuk.debating.non.outbound

import com.yuk.debating.inheritence.outbound.TestEntity
import javax.persistence.*

@Entity
@Table(name = "test2")
class Test2Entity(
    testColumn: String
) {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long = 0

    @Column(name = "test")
    var testColumn: String = ""
        protected set

    @OneToOne(optional = false)
    @JoinColumn(name= "test_id")
    lateinit var testEntity: TestEntity

    init {
        this.testColumn = testColumn
    }

    fun update() {
        testColumn = "aa"
    }
}