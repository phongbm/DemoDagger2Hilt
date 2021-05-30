package com.phongbm.demodagger2hilt

import androidx.lifecycle.ViewModel
import java.util.*

/**
 * Created by PhongBM on 05/29/2021
 */

class SharedViewModel : ViewModel() {
    var id = UUID.randomUUID().toString()
        private set

}