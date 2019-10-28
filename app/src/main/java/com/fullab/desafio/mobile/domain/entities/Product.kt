package com.fullab.desafio.mobile.domain.entities

import com.google.gson.annotations.SerializedName

data class Product(
    @SerializedName(SKUS) val SKUs: List<SKU>,
    @SerializedName(AVAILABILITY) val availability: Boolean
) {

    private companion object {
        private const val SKUS: String = "Skus"
        private const val AVAILABILITY: String = "Availability"
    }
}