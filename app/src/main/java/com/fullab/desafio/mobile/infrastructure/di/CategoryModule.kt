package com.fullab.desafio.mobile.infrastructure.di

import com.fullab.desafio.mobile.domain.repositories.ICategoryRepository
import com.fullab.desafio.mobile.infrastructure.builder.RetrofitBuilder
import com.fullab.desafio.mobile.infrastructure.data.datamapper.CategoryDataMapper
import com.fullab.desafio.mobile.infrastructure.data.datamapper.SubCategoryDataMapper
import com.fullab.desafio.mobile.infrastructure.data.datasource.ICategoryRemoteDataSource
import com.fullab.desafio.mobile.infrastructure.data.repositories.CategoryRepository
import org.koin.dsl.module

class CategoryModule {

    companion object {
        val module = module {
            single<ICategoryRepository> { CategoryRepository() }
            single { CategoryDataMapper() }
            single { SubCategoryDataMapper() }
            single { RetrofitBuilder.buildRetrofit().create(ICategoryRemoteDataSource::class.java) }
        }
    }
}