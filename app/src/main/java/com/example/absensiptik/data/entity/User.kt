package com.example.absensiptik.data.entity

data class User(
    var userNumber: String = "", // As a Username
    var password: String = "",
    var role: String = "",
    var name: String = "",
    var photoProfile: String = "",
    var gender: String = "",
    var token: String? = ""
)