package com.yuk.debating.lambdadiff

import kotlin.streams.toList

class LambdaReference {
    fun toIteratorFunction() {
        val list = listOf<LambdaData>()

        list.map(LambdaData::toMutate)
    }

    fun toAnonymousFunction() {
        val list = listOf<LambdaData>()

        list.stream().map(LambdaData::toMutate).toList()
    }
}