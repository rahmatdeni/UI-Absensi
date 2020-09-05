package com.example.absensiptik.data.service

import com.example.absensiptik.data.entity.AttendantBody
import com.example.absensiptik.data.response.AttendantResponse
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.POST

interface NotificationService {
    @POST("send")
    fun pushNotification(@Body attendentBody: AttendantBody): Call<AttendantResponse>
}