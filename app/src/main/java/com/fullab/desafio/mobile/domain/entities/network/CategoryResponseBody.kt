package com.fullab.desafio.mobile.domain.entities.network

import com.fullab.desafio.mobile.domain.entities.Category
import com.google.gson.annotations.SerializedName

data class CategoryResponseBody(
    @SerializedName("Categories") val categories: List<Category>
)