package com.fullab.desafio.mobile.infrastructure.data.repositories

import com.fullab.desafio.mobile.domain.entities.Product
import com.fullab.desafio.mobile.domain.entities.network.ProductRequestBody
import com.fullab.desafio.mobile.domain.repositories.IProductRepository
import com.fullab.desafio.mobile.infrastructure.data.datasource.IProductRemoteDataSource
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import org.koin.core.KoinComponent
import org.koin.core.inject

class ProductRepository : IProductRepository, KoinComponent {

    private val productRemoteDataSource: IProductRemoteDataSource by inject()

    override fun searchCriteria(
        body: ProductRequestBody,
        onError: (Throwable) -> Unit,
        onSuccess: (List<Product>) -> Unit
    ) {
        productRemoteDataSource.searchCriteria(body)
            .subscribeOn(Schedulers.computation())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe({ onSuccess(it.products) }, { onError(it) })
    }
}