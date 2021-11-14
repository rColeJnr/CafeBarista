package com.rick.cafebistro.stockmanagement

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.rick.cafebistro.MainActivity
import com.rick.cafebistro.R
import com.rick.cafebistro.databinding.FragmentStockManagementBinding

class StockManagementFragment: Fragment() {

    private var _binding: FragmentStockManagementBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentStockManagementBinding.inflate(inflater, container, false)

        (activity as MainActivity).supportActionBar?.title = "Stock"
        (activity as MainActivity).supportActionBar?.setHomeAsUpIndicator(R.drawable.ic_back_arrow)

        return binding.root
    }

}