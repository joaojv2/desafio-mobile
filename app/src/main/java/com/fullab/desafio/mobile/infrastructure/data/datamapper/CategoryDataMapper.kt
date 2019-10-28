package com.fullab.desafio.mobile.infrastructure.data.datamapper

import com.fullab.desafio.mobile.domain.entities.Category
import com.fullab.desafio.mobile.dto.CategoryDTO
import com.fullab.desafio.mobile.infrastructure.data.datamapper.interfaces.DataMapper
import org.koin.core.KoinComponent
import org.koin.core.inject

class CategoryDataMapper : DataMapper<Category, CategoryDTO>, KoinComponent {

    private val subCategoryDataMapper: SubCategoryDataMapper by inject()

    override fun map(input: Category): CategoryDTO {
        return CategoryDTO(input.id, input.name, input.subCategories.map { subCategoryDataMapper.map(it) })
    }
}