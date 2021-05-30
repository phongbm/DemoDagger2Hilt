package com.phongbm.demodagger2hilt.dagger

import com.phongbm.demodagger2hilt.OneFragment
import com.phongbm.demodagger2hilt.TwoFragment
import dagger.Component
import javax.inject.Singleton

/**
 * Created by PhongBM on 05/30/2021
 */

@Singleton
@ActivityScope
@Component(modules = [ViewModelModule::class])
interface AppComponent {
    @Component.Builder
    interface Builder {
        fun build(): AppComponent
    }

    fun inject(fragment: OneFragment)
    fun inject(fragment: TwoFragment)

}