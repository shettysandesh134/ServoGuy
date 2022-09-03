package com.sandeshshetty.servoguy.business.domain.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Product(
    val id: String,
    val pName: String,
    val pWeight: String,
    val pPrice: String,
    val pExpiry: String,
    val pQuantity: String,
    val pImage: String,
    val type: String
): Parcelable {

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Product

        if (id != other.id) return false
        if (pName != other.pName) return false
        if (pWeight != other.pWeight) return false
        if (pPrice != other.pPrice) return false
        if (pExpiry != other.pExpiry) return false
        if (pQuantity != other.pQuantity) return false
        if (pImage != other.pImage) return false
        if (type != other.type) return false

        return true
    }

    override fun hashCode(): Int {
        var result = id.hashCode()
        result = 31 * result + pName.hashCode()
        result = 31 * result + pWeight.hashCode()
        result = 31 * result + pPrice.hashCode()
        result = 31 * result + pExpiry.hashCode()
        result = 31 * result + pQuantity.hashCode()
        result = 31 * result + pImage.hashCode()
        result = 31 * result + type.hashCode()
        return result
    }
}