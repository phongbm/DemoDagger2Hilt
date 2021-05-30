package com.phongbm.demodagger2hilt

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.phongbm.demodagger2hilt.databinding.FragmentOneBinding
import javax.inject.Inject

/**
 * Created by PhongBM on 05/29/2021
 */

class OneFragment : Fragment() {
    companion object {
        private const val TAG = "OneFragment"
    }

    private var _binding: FragmentOneBinding? = null
    private val binding get() = _binding!!

    @Inject
    lateinit var viewModelFactory: ViewModelProvider.Factory
    private val viewModel: SharedViewModel by viewModels { viewModelFactory }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        App.instance.appComponent.inject(this)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        _binding = FragmentOneBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        Log.d(TAG, "onCreateView()... " + viewModel.id)

        binding.btnOpenTwoFragment.setOnClickListener {
            findNavController().navigate(R.id.actTwoFragment)
        }

        binding.btnOpenFeature.setOnClickListener {
            findNavController().navigate(R.id.navSubFeature)
        }
    }

}