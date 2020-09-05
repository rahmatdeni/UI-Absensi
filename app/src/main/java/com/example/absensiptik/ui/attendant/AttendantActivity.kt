package com.example.absensiptik.ui.attendant

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.example.absensiptik.R
import com.example.absensiptik.databinding.ActivityAttendantBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class AttendantActivity : AppCompatActivity() {
    private lateinit var attendantDataBinding: ActivityAttendantBinding
    private lateinit var attendantViewModel: AttendantViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        init()
    }

    private fun init() {
        attendantViewModel = ViewModelProvider(this).get(AttendantViewModel::class.java)
        attendantDataBinding = DataBindingUtil.setContentView(this, R.layout.activity_attendant)
        attendantDataBinding.apply {
            lifecycleOwner = this@AttendantActivity
            viewModel = this@AttendantActivity.attendantViewModel
        }
    }
}