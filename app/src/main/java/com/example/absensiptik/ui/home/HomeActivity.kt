package com.example.absensiptik.ui.home

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.example.absensiptik.R
import com.example.absensiptik.databinding.ActivityHomeBinding
import com.example.absensiptik.ui.profile.ProfileActivity
import com.google.android.material.tabs.TabLayoutMediator
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.android.synthetic.main.activity_home.*

@AndroidEntryPoint
class HomeActivity : AppCompatActivity() {
    private lateinit var homeDataBinding: ActivityHomeBinding
    private lateinit var homeViewModel: HomeViewModel
    private var homeAdapter = HomeAdapter()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        init()
        action()
        tablayout()
    }

    private fun init() {
        homeViewModel = ViewModelProvider(this).get(HomeViewModel::class.java)
        homeDataBinding = DataBindingUtil.setContentView(this, R.layout.activity_home)
        homeDataBinding.apply {
            lifecycleOwner = this@HomeActivity
            viewModel = this@HomeActivity.homeViewModel
        }
    }

    private fun action() {
        iv_profile.setOnClickListener {
            startActivity(Intent(this, ProfileActivity::class.java))
        }
    }

    private fun tablayout() {
        vp_home.apply {
            adapter = this@HomeActivity.homeAdapter
        }
        TabLayoutMediator(tl_home, vp_home) { tab, position ->
            when (position) {
                0 -> {
                    tab.text = this.homeViewModel.day[position]
                }
                1 -> {
                    tab.text = this.homeViewModel.day[position]
                }
                2 -> {
                    tab.text = this.homeViewModel.day[position]
                }
                3 -> {
                    tab.text = this.homeViewModel.day[position]
                }
                4 -> {
                    tab.text = this.homeViewModel.day[position]
                }
            }
        }.attach()
    }
}