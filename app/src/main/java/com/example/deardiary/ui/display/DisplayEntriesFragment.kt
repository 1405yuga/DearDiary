package com.example.deardiary.ui.display

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.deardiary.R
import com.example.deardiary.databinding.FragmentDisplayEntriesBinding

class DisplayEntriesFragment : Fragment() {
    private lateinit var binding: FragmentDisplayEntriesBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_display_entries, container, false)
    }
}