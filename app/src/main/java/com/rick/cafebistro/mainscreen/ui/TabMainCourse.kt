package com.rick.cafebistro.mainscreen.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.rick.cafebistro.MainActivity
import com.rick.cafebistro.R
import com.rick.cafebistro.databinding.FragmentStockManagementBinding
import com.rick.cafebistro.databinding.TabMainCourseBinding

class TabMainCourse: Fragment() {

    private var _binding: TabMainCourseBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = TabMainCourseBinding.inflate(inflater, container, false)

        return binding.root
    }

}
