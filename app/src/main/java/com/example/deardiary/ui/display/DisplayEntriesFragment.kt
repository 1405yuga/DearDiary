package com.example.deardiary.ui.display

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.deardiary.R
import com.example.deardiary.databinding.FragmentDisplayEntriesBinding

class DisplayEntriesFragment : Fragment() {
    private lateinit var binding: FragmentDisplayEntriesBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentDisplayEntriesBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        applyBinding()
    }

    private fun applyBinding() {
        binding.apply {
            addEntry.setOnClickListener { findNavController().navigate(R.id.manageEntryFragment) }
        }
    }
}