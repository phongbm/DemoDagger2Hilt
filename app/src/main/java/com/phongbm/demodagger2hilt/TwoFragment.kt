package com.phongbm.demodagger2hilt

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.phongbm.demodagger2hilt.databinding.FragmentTwoBinding

/**
 * Created by PhongBM on 05/29/2021
 */

class TwoFragment : Fragment() {
    companion object {
        private const val TAG = "TwoFragment"
    }

    private var _binding: FragmentTwoBinding? = null
    private val binding get() = _binding!!

    private val viewModel: SharedViewModel by viewModels()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        _binding = FragmentTwoBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        Log.d(TAG, "onViewCreated()... " + viewModel.id)
    }

}