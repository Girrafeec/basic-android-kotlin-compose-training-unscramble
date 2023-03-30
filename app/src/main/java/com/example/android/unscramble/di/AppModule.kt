package com.example.android.unscramble.di

import androidx.lifecycle.ViewModel
import com.example.android.unscramble.data.DataSource
import com.example.android.unscramble.ui.GameViewModel
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class AppModule {

    @Singleton
    @Provides
    fun provideDataSource() = DataSource()


}