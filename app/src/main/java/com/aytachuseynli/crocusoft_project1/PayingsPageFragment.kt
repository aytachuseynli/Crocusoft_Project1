package com.aytachuseynli.crocusoft_project1

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.aytachuseynli.crocusoft_project1.databinding.FragmentHomePageBinding
import com.aytachuseynli.crocusoft_project1.databinding.FragmentMorePageBinding
import com.aytachuseynli.crocusoft_project1.databinding.FragmentPayingsPageBinding

class PayingsPageFragment : Fragment() {
    private var _binding: FragmentPayingsPageBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentPayingsPageBinding.inflate(inflater, container, false)
        val view = binding.root
        return view
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}