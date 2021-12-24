package com.yuk.debating.state

import com.yuk.debating.state.domain.State
import com.yuk.debating.state.outbound.ProductEntity
import com.yuk.debating.state.outbound.ProductEntityRepository
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
@Transactional
class StateService(
    private val productEntityRepository: ProductEntityRepository
) {

    fun stateWork() {
        productEntityRepository.save(
            ProductEntity(State.STOCKIN)
        )

        productEntityRepository.save(
            ProductEntity(State.STOCKOUT)
        )

        val list = productEntityRepository.findAllById(listOf(1, 2))

        list.forEach {
            it.state.postWork()
        }
    }
}