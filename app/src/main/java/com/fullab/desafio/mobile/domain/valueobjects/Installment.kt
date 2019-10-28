package com.fullab.desafio.mobile.domain.valueobjects

import com.google.gson.annotations.SerializedName

data class Installment(
    @SerializedName(COUNT) val count: Int,
    @SerializedName(VALUE) val value: Double,
    @SerializedName(TOTAL) val total: Double,
    @SerializedName(RATE) val rate: Double
) {

    private companion object {
        private const val COUNT: String = "Count"
        private const val VALUE: String = "Value"
        private const val TOTAL: String = "Total"
        private const val RATE: String = "Rate"
    }
}