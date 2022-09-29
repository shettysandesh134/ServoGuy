package com.sandeshshetty.servoguy.framework.datasource.cache.abstraction

import com.sandeshshetty.servoguy.business.domain.model.Product

/**
 * @author sandeshshetty
 * Created 9/21/22 at {TIME}
 */
interface ProductDaoService {

    suspend fun insertProduct(product: Product): Long

}