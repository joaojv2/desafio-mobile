package com.fullab.desafio.mobile.domain.entities

import com.google.gson.annotations.SerializedName

data class SubCategory(
    @SerializedName(ID) val id: Int,
    @SerializedName(NAME) val name: String
) {

    private companion object {
        private const val ID: String = "Id"
        private const val NAME: String = "Name"
    }
}