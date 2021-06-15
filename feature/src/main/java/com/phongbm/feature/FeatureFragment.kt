package com.phongbm.feature

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.phongbm.feature.databinding.FragmentFeatureBinding
import dagger.hilt.android.AndroidEntryPoint

/**
 * Created by PhongBM on 05/29/2021
 */

@AndroidEntryPoint
class FeatureFragment : Fragment() {
    companion object {
        private const val TAG = "FeatureFragment"
    }

    private var _binding: FragmentFeatureBinding? = null
    private val binding get() = _binding!!

    private val viewModel: FeatureViewModel by viewModels()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        _binding = FragmentFeatureBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        Log.d(TAG, "onViewCreated()... " + viewModel.id)
    }

}