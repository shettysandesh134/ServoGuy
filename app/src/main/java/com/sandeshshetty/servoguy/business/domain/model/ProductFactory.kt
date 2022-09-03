package com.sandeshshetty.servoguy.business.domain.model

import java.util.*
import kotlin.collections.ArrayList

class ProductFactory {

    fun createSingleProduct(
        id: String? = null,
        pName: String,
        pWeight: String,
        pPrice: String,
        pExpiry: String,
        pQuantity: String,
        pImage: String,
        type: String
    ): Product {
        return Product(
            id = id?: UUID.randomUUID().toString(),
            pName = pName,
            pWeight = pWeight,
            pPrice = pPrice,
            pExpiry = pExpiry,
            pQuantity = pQuantity,
            pImage = pImage,
            type = type
        )
    }

    fun createProductList(count: Int): List<Product> {
        val productsList: ArrayList<Product> = ArrayList()
        for (i in 0 until count) {
            productsList.add(
                Product(
                    id = UUID.randomUUID().toString(),
                    pName = UUID.randomUUID().toString(),
                    pWeight = UUID.randomUUID().toString(),
                    pPrice = UUID.randomUUID().toString(),
                    pExpiry = UUID.randomUUID().toString(),
                    pQuantity = UUID.randomUUID().toString(),
                    pImage = UUID.randomUUID().toString(),
                    type = UUID.randomUUID().toString()
                )
            )
        }
        return productsList
    }

}