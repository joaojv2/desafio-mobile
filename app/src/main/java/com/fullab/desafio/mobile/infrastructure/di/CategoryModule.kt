package com.fullab.desafio.mobile.infrastructure.di

import com.fullab.desafio.mobile.domain.entities.Category
import com.fullab.desafio.mobile.domain.entities.SubCategory
import com.fullab.desafio.mobile.domain.repositories.ICategoryRepository
import com.fullab.desafio.mobile.dto.CategoryDTO
import com.fullab.desafio.mobile.dto.SubCategoryDTO
import com.fullab.desafio.mobile.infrastructure.builder.RetrofitBuilder
import com.fullab.desafio.mobile.infrastructure.data.datamapper.CategoryDataMapper
import com.fullab.desafio.mobile.infrastructure.data.datamapper.SubCategoryDataMapper
import com.fullab.desafio.mobile.infrastructure.data.datamapper.interfaces.IDataMapper
import com.fullab.desafio.mobile.infrastructure.data.datasource.ICategoryRemoteDataSource
import com.fullab.desafio.mobile.infrastructure.data.repositories.CategoryRepository
import org.koin.dsl.module

class CategoryModule {

    companion object {
        val module = module {
            single<ICategoryRepository> { CategoryRepository() }
            single<IDataMapper<Category, CategoryDTO>> { CategoryDataMapper() }
            single<IDataMapper<SubCategory, SubCategoryDTO>> { SubCategoryDataMapper() }
            single<ICategoryRemoteDataSource> {
                RetrofitBuilder.buildRetrofit().create(ICategoryRemoteDataSource::class.java)
            }
        }
    }
}