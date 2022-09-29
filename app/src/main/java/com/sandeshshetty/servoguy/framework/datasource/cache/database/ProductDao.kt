package com.sandeshshetty.servoguy.framework.datasource.cache.database

import androidx.room.Dao
import androidx.room.Insert
import com.sandeshshetty.servoguy.framework.datasource.cache.model.ProductCacheEntity

/**
 * @author sandeshshetty
 * Created 9/19/22 at {TIME}
 */
@Dao
interface ProductDao {

    @Insert
    suspend fun insertProduct(productCacheEntity: ProductCacheEntity): Long

}