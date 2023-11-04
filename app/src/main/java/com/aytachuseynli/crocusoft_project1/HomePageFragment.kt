package com.aytachuseynli.crocusoft_project1

import android.graphics.Color
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.aytachuseynli.crocusoft_project1.databinding.FragmentHomePageBinding

class HomePageFragment : Fragment() {
    private var _binding: FragmentHomePageBinding? = null
    private val binding get() = _binding!!
    private lateinit var adapter: EnergyAdapter
    private lateinit var adapter2: NewsAdapter


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentHomePageBinding.inflate(inflater, container, false)
        val view = binding.root

        val energyList = ArrayList<EnergyList>()
        val e1 = EnergyList(1,"increase_icon","Ortalama enerji İstehlakı", Color.rgb(41, 77, 140))
        val e2 = EnergyList(2,"square_icon","Add auto Top-Up",Color.rgb(168, 197, 183))
        val e3 = EnergyList(3,"energy_icon","Enerjiyə qənaət məsləhətləri",Color.rgb(234, 84, 85))

        energyList.add(e1)
        energyList.add(e2)
        energyList.add(e3)

        val newsList = ArrayList<NewsList>()
        val n1 = NewsList(1,"news1_image","Prezident İlham Əliyev Mingəçevir şəhərinin elektrik paylayıcı şəbəkəsinin Avtomatik İdarəetmə...")
        val n2 = NewsList(2,"news2_image","Ağcabədinin Pərioğullar və Hacıbədəlli kəndlərinin elektrik şəbəkəsi yenidən qurulur.")
        val n3 = NewsList(3,"news1_image","Prezident İlham Əliyev Mingəçevir şəhərinin elektrik paylayıcı şəbəkəsinin Avtomatik İdarəetmə...")

        newsList.add(n1)
        newsList.add(n2)
        newsList.add(n3)

        adapter = EnergyAdapter(requireContext(),energyList)
        adapter2 = NewsAdapter(requireContext(),newsList)


        adapter.setDataList(energyList)
        adapter2.setDataList(newsList)

        binding.rvEnergy.adapter = adapter
        binding.rvNews.adapter = adapter2

        return view
    }



}


