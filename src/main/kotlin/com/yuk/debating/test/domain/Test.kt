package com.yuk.debating.test.domain

import com.yuk.debating.Default

abstract class Test protected constructor() {
    constructor(testColumn: String) : this() {
        this.testColumn = testColumn
    }

    constructor(id: Long, testColumn: String) : this() {
        this.id = id
        this.testColumn = testColumn
    }

    abstract var testColumn: String
        protected set

    abstract var id: Long
        protected set

    fun updateColumn() {
        testColumn = "bbbb"
    }
}