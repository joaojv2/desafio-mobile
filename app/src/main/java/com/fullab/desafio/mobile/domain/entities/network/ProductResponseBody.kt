package com.fullab.desafio.mobile.domain.entities.network

import com.fullab.desafio.mobile.domain.entities.Product
import com.google.gson.annotations.SerializedName

data class ProductResponseBody(
    @SerializedName(SIZE) val size: Int,
    @SerializedName(TOTAL) val total: Int,
    @SerializedName(DELAY) val delay: Double,
    @SerializedName(OFFSET) val offset: Int,
    @SerializedName(PRODUCTS) val products: List<Product>
) {

    private companion object {
        private const val SIZE: String = "Size"
        private const val TOTAL: String = "Total"
        private const val DELAY: String = "Delay"
        private const val OFFSET: String = "Offset"
        private const val PRODUCTS: String = "Products"
    }
}