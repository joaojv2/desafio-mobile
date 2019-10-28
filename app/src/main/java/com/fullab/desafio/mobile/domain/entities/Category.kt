package com.fullab.desafio.mobile.domain.entities

import com.google.gson.annotations.SerializedName

data class Category(
    @SerializedName(ID) val id: Int,
    @SerializedName(NAME) val name: String,
    @SerializedName(SUB_CATEGORIES) val subCategories: List<SubCategory>
) {

    internal companion object {
        private const val ID: String = "Id"
        private const val NAME: String = "Name"
        private const val SUB_CATEGORIES: String = "SubCategories"
    }
}