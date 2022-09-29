package com.sandeshshetty.servoguy.business.data.cache.implementation

import com.sandeshshetty.servoguy.business.data.cache.abstraction.ProductCacheDataSource
import com.sandeshshetty.servoguy.business.domain.model.Product
import com.sandeshshetty.servoguy.framework.datasource.cache.abstraction.ProductDaoService
import javax.inject.Inject

/**
 * @author sandeshshetty
 * Created 9/21/22 at {TIME}
 */
class ProductCacheDataSourceImpl
@Inject
constructor(
    private val productDaoService: ProductDaoService
): ProductCacheDataSource {

    override suspend fun insertProduct(product: Product): Long {
        return productDaoService.insertProduct(product)
    }
}