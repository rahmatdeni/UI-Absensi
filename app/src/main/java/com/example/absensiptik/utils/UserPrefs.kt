package com.example.absensiptik.utils

import android.content.Context
import com.example.absensiptik.App

object SharedPrefs {
    private const val file_name = "com.example.absensiptik.PREFERENCES"
    private val sharedPref = App.instance.getSharedPreferences(file_name, Context.MODE_PRIVATE)
    fun set(key: String, value: Any) {
        val editor = sharedPref.edit()
        when (value) {
            is String -> {
                editor.putString(key, value)
            }
            is Int -> {
                editor.putInt(key, value)
            }
            is Float -> {
                editor.putFloat(key, value)
            }
            is Long -> {
                editor.putLong(key, value)
            }
            is Boolean -> {
                editor.putBoolean(key, value)
            }
        }
        editor.apply()
    }
    fun get(key: String, defaultValue: Any): Any? {
        val shared = sharedPref
        return when (defaultValue) {
            is String -> {
                shared.getString(key, defaultValue)
            }
            is Int -> {
                shared.getInt(key, defaultValue)
            }
            is Float -> {
                shared.getFloat(key, defaultValue)
            }
            is Long -> {
                shared.getLong(key, defaultValue)
            }
            is Boolean -> {
                shared.getBoolean(key, defaultValue)
            }
            else -> {
                null
            }
        }
    }
}