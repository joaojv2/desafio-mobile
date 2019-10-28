package com.fullab.desafio.mobile.application

import com.fullab.desafio.mobile.domain.entities.Category
import com.fullab.desafio.mobile.domain.repositories.ICategoryRepository
import com.fullab.desafio.mobile.dto.CategoryDTO
import com.fullab.desafio.mobile.infrastructure.data.datamapper.interfaces.IDataMapper
import com.fullab.desafio.mobile.infrastructure.di.CategoryModule
import org.koin.core.KoinComponent
import org.koin.core.context.startKoin
import org.koin.core.inject

class CategoryApplication : ICategoryApplication, KoinComponent {

    private val categoryRepository: ICategoryRepository by inject()
    private val categoryDataMapper: IDataMapper<Category, CategoryDTO> by inject()

    override fun getCategoryTree(
        onError: (Throwable) -> Unit,
        onSuccess: (List<CategoryDTO>) -> Unit
    ) {
        categoryRepository.getCategoryTree(
            { onError(it) },
            { categories -> onSuccess(categories.map { categoryDataMapper.map(it) }) }
        )
    }

    private companion object {
        init {
            startKoin { modules(CategoryModule.module) }
        }
    }
}