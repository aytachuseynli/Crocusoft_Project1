package com.aytachuseynli.crocusoft_project1

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.aytachuseynli.crocusoft_project1.databinding.FragmentMorePageBinding

class MorePageFragment : Fragment() {
    private var _binding: FragmentMorePageBinding? = null
    private val binding get() = _binding!!
    private lateinit var adapter4: MoreAdapter


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentMorePageBinding.inflate(inflater, container, false)
        val view = binding.root

        val moreList = ArrayList<MoreList>()
        val m1 = MoreList(1,"others_danger_icon","Təhlükəsizlik qaydaları")
        val m2 = MoreList(2,"question_icon","Tez-tez verilən suallar")
        val m3 = MoreList(3,"chat_icon","Elektron Müraciət")
        val m4 = MoreList(4,"location_icon","Regional ünvanlarımız")
        val m5 = MoreList(5,"headphones_icon","Müştəri xidmətləri")
        val m6 = MoreList(6,"metal_icon","Sərbəst güclər (info)")
        val m7 = MoreList(7,"metal_icon","это пока не надо, не добавляй его")

        moreList.add(m1)
        moreList.add(m2)
        moreList.add(m3)
        moreList.add(m4)
        moreList.add(m5)
        moreList.add(m6)
        moreList.add(m7)

        adapter4 = MoreAdapter(requireContext(),moreList)
        adapter4.setDataList(moreList)


        binding.rvMore.adapter = adapter4

        return view

    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}