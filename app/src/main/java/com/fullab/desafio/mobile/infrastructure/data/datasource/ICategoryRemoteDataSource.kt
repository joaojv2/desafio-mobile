package com.fullab.desafio.mobile.infrastructure.data.datasource

import com.fullab.desafio.mobile.domain.entities.Category
import io.reactivex.Observable
import retrofit2.http.GET

interface ICategoryRemoteDataSource {

    @GET("StorePreference/CategoryTree")
    fun categoryTree(): Observable<List<Category>>
}