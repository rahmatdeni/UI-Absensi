package com.example.absensiptik.ui.login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.absensiptik.R
import com.example.absensiptik.databinding.ActivityLoginBinding
import com.example.absensiptik.ui.home.HomeActivity
import com.example.absensiptik.utils.NetworkState
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class LoginActivity : AppCompatActivity() {
    private lateinit var loginDataBinding: ActivityLoginBinding
    private lateinit var loginViewModel: LoginViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        init()
        login()
    }

    private fun init() {
        loginViewModel = ViewModelProvider(this).get(LoginViewModel::class.java)
        loginDataBinding = DataBindingUtil.setContentView(this, R.layout.activity_login)
        loginDataBinding.apply {
            lifecycleOwner = this@LoginActivity
            viewModel = this@LoginActivity.loginViewModel
        }
    }

    private fun login() {
        loginViewModel.isLoggedIn.observe(this, Observer {
            if(it.status == NetworkState.Status.SUCCESS) {
                startActivity(Intent(this, HomeActivity::class.java))
                finish()
            } else if(it.status == NetworkState.Status.FAILED) {
                Toast.makeText(this, "Login Failed!", Toast.LENGTH_LONG).show()
            }
        })
    }
}