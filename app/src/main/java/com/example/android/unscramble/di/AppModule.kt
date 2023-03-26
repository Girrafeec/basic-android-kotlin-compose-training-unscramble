package com.example.android.unscramble.di

import androidx.lifecycle.ViewModel
import com.example.android.unscramble.data.DataSource
import com.example.android.unscramble.ui.GameViewModel
import dagger.Binds
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module(
    includes = [AppModule.AppBindModule::class]
//    subcomponents = [GameScreenComponent::class]
)
class AppModule {

    @Singleton
    @Provides
    fun provideDataSource() = DataSource()

    @Module
    interface AppBindModule {

        @Binds
        @Singleton
        fun bindGameViewModel(impl: GameViewModel): ViewModel

    }

}