package com.fullab.desafio.mobile.application

import com.fullab.desafio.mobile.dto.CategoryDTO
import com.fullab.desafio.mobile.infrastructure.data.datamapper.CategoryDataMapper
import com.fullab.desafio.mobile.infrastructure.data.repositories.CategoryRepository
import org.koin.core.KoinComponent
import org.koin.core.inject

class CategoryApplication : ICategoryApplication, KoinComponent {

    private val categoryRepository: CategoryRepository by inject()
    private val categoryDataMapper: CategoryDataMapper by inject()

    override fun getCategoryTree(
        onError: (Throwable) -> Unit,
        onSuccess: (List<CategoryDTO>) -> Unit
    ) {
        categoryRepository.getCategoryTree(
            { onError(it) },
            { categories -> onSuccess(categories.map { categoryDataMapper.map(it) }) }
        )
    }
}