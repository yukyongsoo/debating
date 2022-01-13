package com.yuk.debating.sigletonvalue

class NotBean{
    fun print() {
        println(SingletonValue.get().host)
        println(SingletonValue.get().password)
        println(SingletonValue.get().port)
    }
}