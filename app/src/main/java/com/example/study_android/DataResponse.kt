package com.example.study_android

data class DataResponse<T>(
    val status : Int,
    val message : String,
    val data : T
)