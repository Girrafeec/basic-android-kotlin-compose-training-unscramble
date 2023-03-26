package com.example.android.unscramble.di

import com.example.android.unscramble.MainActivity
import com.example.android.unscramble.ui.GameViewModel
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(
    modules = [AppModule::class],
//    dependencies = [AppDependencies::class]
)
interface AppComponent {

    fun inject(activity: MainActivity)

    fun getViewModel(): GameViewModel

    @Component.Builder
    interface Builder {

//        fun dependencies(dependencies: AppDependencies): Builder

        fun build(): AppComponent
    }

}