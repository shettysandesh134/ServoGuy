package com.sandeshshetty.servoguy.business.domain.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Product(
    val id: String,
    val productName: String,
    val productWeight: String,
    val productPrice: String,
    val productExpiry: String,
    val productQuantity: String,
    val productImage: String,
    val type: String
): Parcelable {

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Product

        if (id != other.id) return false
        if (productName != other.productName) return false
        if (productWeight != other.productWeight) return false
        if (productPrice != other.productPrice) return false
        if (productExpiry != other.productExpiry) return false
        if (productQuantity != other.productQuantity) return false
        if (productImage != other.productImage) return false
        if (type != other.type) return false

        return true
    }

    override fun hashCode(): Int {
        var result = id.hashCode()
        result = 31 * result + productName.hashCode()
        result = 31 * result + productWeight.hashCode()
        result = 31 * result + productPrice.hashCode()
        result = 31 * result + productExpiry.hashCode()
        result = 31 * result + productQuantity.hashCode()
        result = 31 * result + productImage.hashCode()
        result = 31 * result + type.hashCode()
        return result
    }
}