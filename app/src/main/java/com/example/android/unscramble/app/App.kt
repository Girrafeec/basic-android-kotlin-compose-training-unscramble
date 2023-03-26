package com.example.android.unscramble.app

import android.app.Application
import android.content.Context
import com.example.android.unscramble.di.AppComponent
//import com.example.android.unscramble.di.AppDependencies
import com.example.android.unscramble.di.DaggerAppComponent

class App : Application() {

//    lateinit var appComponent: AppComponent
//
//    override fun onCreate() {
//        super.onCreate()
//        appComponent = DaggerAppComponent
//            .builder()
////            .dependencies(dependencies = AppDependenciesImpl())
//            .build()
//    }

//    private inner class AppDependenciesImpl : AppDependencies {
//        override val applicationContext: Context = this@App
//    }

}