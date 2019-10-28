package com.fullab.desafio.mobile.domain.entities.network

import com.google.gson.annotations.SerializedName

data class ProductRequestBody(
    @SerializedName(SIZE) val size: Int,
    @SerializedName(OFF_SET) val offset: Int,
    @SerializedName(QUERY) val query: String? = null
) {

    internal companion object Constants {
        private const val SIZE: String = "Size"
        private const val QUERY: String = "Query"
        private const val OFF_SET: String = "Offset"
    }
}