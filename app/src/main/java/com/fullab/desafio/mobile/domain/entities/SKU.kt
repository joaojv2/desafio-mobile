package com.fullab.desafio.mobile.domain.entities

import android.media.Image
import com.google.gson.annotations.SerializedName

data class SKU(
    @SerializedName(ID) val id: Int,
    @SerializedName(NAME) val name: String,
    @SerializedName(IMAGES) val images: List<Image>,
    @SerializedName(SELLERS) val sellers: List<Seller>
) {

    private companion object {
        private const val ID: String = "Id"
        private const val NAME: String = "Name"
        private const val IMAGES: String = "Images"
        private const val SELLERS: String = "Sellers"
    }
}