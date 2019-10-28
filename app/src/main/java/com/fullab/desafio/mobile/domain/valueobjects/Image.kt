package com.fullab.desafio.mobile.domain.valueobjects

import com.google.gson.annotations.SerializedName

data class Image(
    @SerializedName(LABEL) val label: String,
    @SerializedName(IMAGE_URL) val imageUrl: String,
    @SerializedName(IMAGE_TAG) val imageTag: String
) {

    private companion object {
        private const val LABEL: String = "Label"
        private const val IMAGE_URL: String = "ImageUrl"
        private const val IMAGE_TAG: String = "ImageTag"
    }
}