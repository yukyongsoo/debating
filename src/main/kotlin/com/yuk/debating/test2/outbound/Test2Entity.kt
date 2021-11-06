package com.yuk.debating.test2.outbound

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.Table

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

    init {
        this.testColumn = testColumn
    }


}