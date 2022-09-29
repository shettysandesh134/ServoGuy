package com.sandeshshetty.servoguy.di

import android.app.Application
import androidx.room.Room
import com.sandeshshetty.servoguy.framework.datasource.cache.database.ProductDatabase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

/**
 * @author sandeshshetty
 * Created 9/19/22 at {TIME}
 */
@Module
@InstallIn(SingletonComponent::class)
object ProductionModule {

    @Singleton
    @Provides
    fun provideProductDatabase(@ApplicationContext application: Application): ProductDatabase {
        return Room
            .databaseBuilder(application, ProductDatabase::class.java, ProductDatabase.DATABASE_NAME)
            .build()
    }

}