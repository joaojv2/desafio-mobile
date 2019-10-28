package com.fullab.desafio.mobile.dto

import java.io.Serializable

data class CategoryDTO(
    val id: Int,
    val name: String,
    val subCategoriesDTO: List<SubCategoryDTO>
) : Serializable