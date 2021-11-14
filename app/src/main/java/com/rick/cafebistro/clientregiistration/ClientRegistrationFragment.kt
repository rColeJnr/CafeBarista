package com.rick.cafebistro.clientregiistration

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.rick.cafebistro.MainActivity
import com.rick.cafebistro.R
import com.rick.cafebistro.databinding.FragmentClientRegistrationBinding

class ClientRegistrationFragment: Fragment() {

    private var _binding: FragmentClientRegistrationBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentClientRegistrationBinding.inflate(inflater, container, false)

        (activity as MainActivity).supportActionBar?.title = "Registro"
        (activity as MainActivity).supportActionBar?.setHomeAsUpIndicator(R.drawable.ic_back_arrow)

        return binding.root
    }

}