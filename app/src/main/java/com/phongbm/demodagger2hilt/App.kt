package com.phongbm.demodagger2hilt

import android.app.Application
import com.phongbm.demodagger2hilt.dagger.AppComponent
import com.phongbm.demodagger2hilt.dagger.DaggerAppComponent
import dagger.hilt.android.HiltAndroidApp

/**
 * Created by PhongBM on 05/28/2021
 */

@HiltAndroidApp
class App : Application() {
    companion object {
        lateinit var instance: App
            private set
    }

    lateinit var appComponent: AppComponent
        private set

    override fun onCreate() {
        super.onCreate()
        instance = this

        appComponent = DaggerAppComponent.builder().build()
    }

}