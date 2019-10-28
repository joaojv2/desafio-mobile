package com.fullab.desafio.mobile.infrastructure.data.repositories

import com.fullab.desafio.mobile.domain.entities.Category
import com.fullab.desafio.mobile.domain.repositories.ICategoryRepository
import com.fullab.desafio.mobile.infrastructure.data.datasource.ICategoryRemoteDataSource
import io.reactivex.schedulers.Schedulers
import org.koin.core.KoinComponent
import org.koin.core.inject

class CategoryRepository : ICategoryRepository, KoinComponent {

    private val categoryRemoteDataSource: ICategoryRemoteDataSource by inject()

    override fun getCategoryTree(
        onError: (Throwable) -> Unit,
        onSuccess: (List<Category>) -> Unit
    ) {
        categoryRemoteDataSource.categoryTree()
            .subscribeOn(Schedulers.computation())
            .subscribe( {onSuccess(it.categories)}, {onError(it)})
    }
}