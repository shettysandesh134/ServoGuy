package com.sandeshshetty.servoguy.framework.datasource.cache.implementation

import com.sandeshshetty.servoguy.business.domain.model.Product
import com.sandeshshetty.servoguy.framework.datasource.cache.abstraction.ProductDaoService
import com.sandeshshetty.servoguy.framework.datasource.cache.database.ProductDao
import com.sandeshshetty.servoguy.framework.datasource.cache.mapper.ProductCacheMapper
import javax.inject.Inject
import javax.inject.Singleton

/**
 * @author sandeshshetty
 * Created 9/21/22 at {TIME}
 */
@Singleton
class ProductDaoServiceImpl
@Inject
constructor(
 private val productDao: ProductDao,
 private val productCacheMapper: ProductCacheMapper
): ProductDaoService {
    override suspend fun insertProduct(product: Product): Long {
        return productDao.insertProduct(productCacheMapper.mapToEntity(product))
    }
}