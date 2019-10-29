package com.fullab.desafio.mobile.domain.repositories

import com.fullab.desafio.mobile.domain.entities.Product
import com.fullab.desafio.mobile.domain.entities.network.ProductRequestBody

interface IProductRepository {

    fun searchCriteria(
        body: ProductRequestBody,
        onError: (Throwable) -> Unit,
        onSuccess: (List<Product>) -> Unit
    )
}