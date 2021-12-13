package com.yuk.debating.non.domain

import com.yuk.debating.Default

class Test2 @Default constructor(
    val id: Long,
    var testColumn: String
) {
    fun update() {
        testColumn = "aa"
    }

    constructor(testColumn: String) : this(0, testColumn)
}