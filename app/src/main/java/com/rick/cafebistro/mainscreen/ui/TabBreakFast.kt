package com.rick.cafebistro.mainscreen.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.AsyncListDiffer
import androidx.recyclerview.widget.AsyncListUtil
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.imageview.ShapeableImageView
import com.google.android.material.textview.MaterialTextView
import com.rick.cafebistro.databinding.ItemBeverageBinding
import com.rick.cafebistro.databinding.TabBreakFastBinding
import com.rick.cafebistro.mainscreen.domain.BreakFast

class TabBreakFast: Fragment() {

    private var _binding: TabBreakFastBinding? = null
    private val binding get() = _binding!!
    private lateinit var itemBinding: ItemBeverageBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = TabBreakFastBinding.inflate(inflater, container, false)



       return binding.root
    }



}