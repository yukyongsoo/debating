package com.yuk.debating.test.domain

import com.yuk.debating.Default

class Test private constructor() {
    @Default
    constructor(testColumn: String) : this() {
        this.testColumn = testColumn
    }

    constructor(id: String, testColumn: String) : this() {
        this.testColumn = testColumn
    }

    var id: Long = 0
        private set

    var testColumn: String = ""
        private set

    fun updateColumn() {
        testColumn = "bbbb"
    }
}