package com.example.absensiptik.ui.courses

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.example.absensiptik.R
import com.example.absensiptik.databinding.ActivityCoursesBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class CoursesActivity : AppCompatActivity() {
    private lateinit var coursesDataBinding: ActivityCoursesBinding
    private lateinit var coursesViewModel: CoursesViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        init()
    }

    private fun init() {
        coursesViewModel = ViewModelProvider(this).get(CoursesViewModel::class.java)
        coursesDataBinding = DataBindingUtil.setContentView(this, R.layout.activity_courses)
        coursesDataBinding.apply {
            lifecycleOwner = this@CoursesActivity
            viewModel = this@CoursesActivity.coursesViewModel
        }
    }
}