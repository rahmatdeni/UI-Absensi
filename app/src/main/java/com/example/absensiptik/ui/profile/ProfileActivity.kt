package com.example.absensiptik.ui.profile

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.example.absensiptik.R
import com.example.absensiptik.databinding.ActivityProfileBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class ProfileActivity : AppCompatActivity() {
    private lateinit var profileDataBinding: ActivityProfileBinding
    private lateinit var profileViewModel: ProfileViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        init()
    }

    private fun init() {
        profileViewModel = ViewModelProvider(this).get(ProfileViewModel::class.java)
        profileDataBinding = DataBindingUtil.setContentView(this, R.layout.activity_profile)
        profileDataBinding.apply {
            lifecycleOwner = this@ProfileActivity
            viewModel = this@ProfileActivity.profileViewModel
        }

        supportActionBar?.title = "Profile"
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}