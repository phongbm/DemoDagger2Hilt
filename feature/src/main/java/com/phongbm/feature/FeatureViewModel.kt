package com.phongbm.feature

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import java.util.*
import javax.inject.Inject

/**
 * Created by PhongBM on 05/31/2021
 */

@HiltViewModel
class FeatureViewModel
@Inject
constructor() : ViewModel() {
    var id = UUID.randomUUID().toString()

}