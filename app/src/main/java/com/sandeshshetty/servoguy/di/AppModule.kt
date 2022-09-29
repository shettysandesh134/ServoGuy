package com.sandeshshetty.servoguy.di

import com.sandeshshetty.servoguy.business.data.cache.abstraction.ProductCacheDataSource
import com.sandeshshetty.servoguy.business.data.cache.implementation.ProductCacheDataSourceImpl
import com.sandeshshetty.servoguy.framework.datasource.cache.abstraction.ProductDaoService
import com.sandeshshetty.servoguy.framework.datasource.cache.database.ProductDao
import com.sandeshshetty.servoguy.framework.datasource.cache.database.ProductDatabase
import com.sandeshshetty.servoguy.framework.datasource.cache.implementation.ProductDaoServiceImpl
import com.sandeshshetty.servoguy.framework.datasource.cache.mapper.ProductCacheMapper
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import java.text.SimpleDateFormat
import java.util.*
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Singleton
    @Provides
    fun provideDateFormat(): SimpleDateFormat {
        val dateFormat = SimpleDateFormat("yyyy-MM-dd", Locale.getDefault())
        dateFormat.timeZone = TimeZone.getDefault()
        return dateFormat
    }

    @Singleton
    @Provides
    fun provideProductDao(productDatabase: ProductDatabase): ProductDao {
        return productDatabase.productDao()
    }

//    @Singleton
//    @Provides
//    fun provideProductCacheMapper(): ProductCacheMapper {
//        return ProductCacheMapper()
//    }

    @Singleton
    @Provides
    fun provideProductDaoService(
        productDao: ProductDao,
        productCacheMapper: ProductCacheMapper
    ): ProductDaoService {
        return ProductDaoServiceImpl(productDao, productCacheMapper)
    }

    @Singleton
    @Provides
    fun provideProductCacheDataSource(
        productDaoService: ProductDaoService
    ): ProductCacheDataSource {
        return ProductCacheDataSourceImpl(productDaoService)
    }

}