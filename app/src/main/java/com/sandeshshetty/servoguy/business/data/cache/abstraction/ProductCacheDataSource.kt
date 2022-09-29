package com.sandeshshetty.servoguy.business.data.cache.abstraction

import com.sandeshshetty.servoguy.business.domain.model.Product
import com.sandeshshetty.servoguy.framework.datasource.cache.model.ProductCacheEntity

/**
 * @author sandeshshetty
 * Created 9/21/22 at {TIME}
 */
interface ProductCacheDataSource {

    suspend fun insertProduct(product: Product): Long

}