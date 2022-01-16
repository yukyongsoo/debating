package com.yuk.debating.lambdadiff

class LambdaData(
  private val string: String
) {
    fun toMutate(): MutateLambdaData {
        return MutateLambdaData(string)
    }
}

class MutateLambdaData(
    private val string: String
)