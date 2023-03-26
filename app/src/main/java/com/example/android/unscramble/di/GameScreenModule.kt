package com.example.android.unscramble.di

import androidx.lifecycle.ViewModel
import com.example.android.unscramble.data.DataSource
import com.example.android.unscramble.ui.GameViewModel
import dagger.Binds
import dagger.Module
import dagger.Provides

//@Module(includes = [GameScreenModule.GameScreenBindModule::class])
//class GameScreenModule {
//
//    @GameScreenScope
//    @Provides
//    fun provideDataSource() = DataSource()
//
//    @Module
//    interface GameScreenBindModule {
//
//        @Binds
//        @GameScreenScope
//        fun bindGameViewModel(impl: GameViewModel): ViewModel
//
//    }
//
//}
