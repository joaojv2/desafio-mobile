package com.fullab.desafio.mobile.infrastructure.data.datasource

import com.fullab.desafio.mobile.domain.entities.network.ProductRequestBody
import com.fullab.desafio.mobile.domain.entities.network.ProductResponseBody
import io.reactivex.Observable
import retrofit2.http.Body
import retrofit2.http.POST

interface IProductRemoteDataSource {

    @POST("Search/Criteria")
    fun searchCriteria(@Body body: ProductRequestBody): Observable<ProductResponseBody>
}