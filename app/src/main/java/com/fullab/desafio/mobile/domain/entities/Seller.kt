package com.fullab.desafio.mobile.domain.entities

import com.fullab.desafio.mobile.domain.valueobjects.Installment
import com.google.gson.annotations.SerializedName

data class Seller(
    @SerializedName(ID) val id: Int,
    @SerializedName(NAME) val name: String,
    @SerializedName(PRICE) val price: Double,
    @SerializedName(LIST_PRICE) val listPrice: Double,
    @SerializedName(BEST_INSTALLMENT) val bestInstallment: Installment
) {

    private companion object {
        private const val ID: String = "Id"
        private const val NAME: String = "Name"
        private const val PRICE: String = "Price"
        private const val LIST_PRICE: String = "ListPrice"
        private const val BEST_INSTALLMENT: String = "BestInstallment"
    }
}