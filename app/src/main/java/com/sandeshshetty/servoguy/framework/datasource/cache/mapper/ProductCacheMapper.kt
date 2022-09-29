package com.sandeshshetty.servoguy.framework.datasource.cache.mapper

import com.sandeshshetty.servoguy.business.domain.model.Product
import com.sandeshshetty.servoguy.business.domain.util.EntityMapper
import com.sandeshshetty.servoguy.framework.datasource.cache.model.ProductCacheEntity
import javax.inject.Inject
import javax.inject.Singleton

/**
 * @author sandeshshetty
 * Created 9/21/22 at {TIME}
 */
@Singleton
class ProductCacheMapper
@Inject
constructor(): EntityMapper<ProductCacheEntity, Product> {
    override fun mapFromEntity(entity: ProductCacheEntity): Product {
        return Product(
            id = entity.id,
            productName = entity.productName,
            productWeight = entity.productWeight,
            productPrice = entity.productPrice,
            productExpiry = entity.productExpiry,
            productQuantity = entity.productQuantity,
            productImage = entity.productImage,
            type = entity.type
        )
    }

    override fun mapToEntity(domainModel: Product): ProductCacheEntity {
        return ProductCacheEntity(
            id = domainModel.id,
            productName = domainModel.productName,
            productWeight = domainModel.productWeight,
            productPrice = domainModel.productPrice,
            productExpiry = domainModel.productExpiry,
            productQuantity = domainModel.productQuantity,
            productImage = domainModel.productImage,
            type = domainModel.type
        )
    }
}