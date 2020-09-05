package com.example.absensiptik.ui.home

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.ViewModel
import com.example.absensiptik.utils.WEEKDAYS

class HomeViewModel @ViewModelInject constructor(): ViewModel() {
    val day = WEEKDAYS
}
