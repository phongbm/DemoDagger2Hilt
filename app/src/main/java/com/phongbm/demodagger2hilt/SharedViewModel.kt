package com.phongbm.demodagger2hilt

import androidx.lifecycle.ViewModel
import com.phongbm.demodagger2hilt.dagger.ActivityScope
import java.util.*
import javax.inject.Inject

/**
 * Created by PhongBM on 05/29/2021
 */

@ActivityScope
class SharedViewModel
@Inject
constructor() : ViewModel() {
    var id = UUID.randomUUID().toString()
        private set

}