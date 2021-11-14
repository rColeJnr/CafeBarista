package com.rick.cafebistro.mainscreen.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.google.android.material.tabs.TabLayoutMediator
import com.rick.cafebistro.MainActivity
import com.rick.cafebistro.R
import com.rick.cafebistro.databinding.FragmentMainScreenBinding

class MainScreenFragment: Fragment() {

    private var _binding: FragmentMainScreenBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentMainScreenBinding.inflate(inflater, container, false)

        (activity as MainActivity).supportActionBar?.title = "Cafe Bistro"
        (activity as MainActivity).supportActionBar?.setHomeAsUpIndicator(R.drawable.ic_burger)

        val tabLayout = binding.tabLayout
        val viewPager = binding.viewPager

        tabLayout.addTab(tabLayout.newTab().setText("Break Fast"))
        tabLayout.addTab(tabLayout.newTab().setText("Main Course"))
        tabLayout.addTab(tabLayout.newTab().setText("Dessert"))

        viewPager.adapter = TabAdapter(activity as MainActivity, tabLayout.tabCount)

        TabLayoutMediator(tabLayout, viewPager){tab, position ->
            when (position){
                0 -> tab.text = "Break Fast"
                1 -> tab.text = "Main Course"
                2 -> tab.text = "Dessert"
            }
        }.attach()

        return binding.root
    }

}