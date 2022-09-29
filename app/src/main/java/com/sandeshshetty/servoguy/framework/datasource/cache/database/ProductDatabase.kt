package com.sandeshshetty.servoguy.framework.datasource.cache.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.sandeshshetty.servoguy.framework.datasource.cache.model.ProductCacheEntity

/**
 * @author sandeshshetty
 * Created 9/19/22 at {TIME}
 */

@Database(entities = [ProductCacheEntity::class], version = 1)
abstract class ProductDatabase: RoomDatabase() {

    abstract fun productDao(): ProductDao

    companion object {
        const val DATABASE_NAME = "servo_db"
    }
}