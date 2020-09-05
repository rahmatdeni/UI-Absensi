package com.example.absensiptik.data.entity

data class Course(
    var name: String = "",
    var day: String = "",
    var time: String = "",
    var room: String = "",
    var lecturer: String = "",
    var token: String = "",
    var location: String = "",
    var students: ArrayList<StudentAttendant>? = arrayListOf()
)