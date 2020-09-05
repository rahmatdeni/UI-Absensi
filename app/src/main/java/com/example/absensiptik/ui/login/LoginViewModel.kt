package com.example.absensiptik.ui.login

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.absensiptik.utils.NetworkState

class LoginViewModel @ViewModelInject constructor() : ViewModel() {
    val isLoggedIn = MutableLiveData<NetworkState>()
    val username = MutableLiveData("")
    val password = MutableLiveData("")

    fun login() {
        isLoggedIn.value = NetworkState.LOADING
        // TODO: Firebase Auth
        isLoggedIn.value = NetworkState.LOADED
    }
}