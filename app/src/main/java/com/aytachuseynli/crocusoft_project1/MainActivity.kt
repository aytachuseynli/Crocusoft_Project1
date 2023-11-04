package com.aytachuseynli.crocusoft_project1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.NavigationUI
import com.aytachuseynli.crocusoft_project1.databinding.ActivityMainBinding
import com.aytachuseynli.crocusoft_project1.databinding.FragmentHomePageBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val firstFragment = HomePageFragment()
        val secondFragment = PayingsPageFragment()
        val thirdFragment = ServicesPageFragment()
        val fourthFragment = AnalysisPageFragment()
        val fifthFragment = MorePageFragment()

        setCurrentFragment(firstFragment)

        binding.bottomNav.setOnItemSelectedListener { item ->
            val fragment = when (item.itemId) {
                R.id.homeNav -> firstFragment
                R.id.payings -> secondFragment
                R.id.services -> thirdFragment
                R.id.analysis -> fourthFragment
                R.id.others -> fifthFragment
                else -> firstFragment
            }
            setCurrentFragment(fragment)
            true
        }
    }

    private fun setCurrentFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.fragmentContainerView, fragment)
            commit()
        }


    }
}