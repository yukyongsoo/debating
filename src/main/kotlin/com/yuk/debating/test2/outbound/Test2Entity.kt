package com.yuk.debating.test2.outbound

import com.yuk.debating.test.outbound.TestEntity
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


}