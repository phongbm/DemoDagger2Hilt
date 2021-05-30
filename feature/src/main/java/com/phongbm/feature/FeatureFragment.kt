package com.phongbm.feature

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.phongbm.feature.databinding.FragmentFeatureBinding

/**
 * Created by PhongBM on 05/29/2021
 */

class FeatureFragment : Fragment() {
    private var _binding: FragmentFeatureBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        _binding = FragmentFeatureBinding.inflate(inflater, container, false)
        return binding.root
    }

}