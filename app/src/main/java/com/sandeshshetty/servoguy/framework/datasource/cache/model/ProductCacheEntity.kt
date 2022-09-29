package com.sandeshshetty.servoguy.framework.datasource.cache.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

/**
 * @author sandeshshetty
 * Created 9/19/22 at {TIME}
 */
@Entity(tableName = "product")
data class ProductCacheEntity(

    @PrimaryKey(autoGenerate = false)
    @ColumnInfo(name = "id")
    val id: String,

    @ColumnInfo(name = "productName")
    val productName: String,

    @ColumnInfo(name = "productWeight")
    val productWeight: String,

    @ColumnInfo(name = "productPrice")
    val productPrice: String,

    @ColumnInfo(name = "productExpiry")
    val productExpiry: String,

    @ColumnInfo(name = "productQuantity")
    val productQuantity: String,

    @ColumnInfo(name = "productImage")
    val productImage: String,

    @ColumnInfo(name = "productName")
    val type: String
) {



    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as ProductCacheEntity

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