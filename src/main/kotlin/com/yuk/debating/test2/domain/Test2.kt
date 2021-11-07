package com.yuk.debating.test2.domain

import com.yuk.debating.Default

class Test2 @Default constructor(
    val id: Long,
    val testColumn: String
) {
    constructor(testColumn: String) : this(0, testColumn)
}