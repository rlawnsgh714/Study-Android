package com.example.study_android

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

private val baseUrl = "http://localhost:8080/"

object RetrofitClass {
    val retrofit = Retrofit.Builder()
        .baseUrl(baseUrl)
        .addConverterFactory(GsonConverterFactory.create())
        .build()
}