package com.yuk.debating.composition.domain

import com.yuk.debating.composition.outbound.Test3Entity

class Test3Domain(
    var name: String = ""
) {
    @Transient
    private var test3Entity: Test3Entity? = null

    constructor(test3Entity: Test3Entity): this(test3Entity.testColumn){
        this.test3Entity = test3Entity
    }

    fun createEntity(): Test3Entity {
        return Test3Entity(name)
    }

    fun update() {
        if(test3Entity == null)
            throw RuntimeException()

        name = "aaa"
        test3Entity!!.testColumn = "aaa"
    }
}