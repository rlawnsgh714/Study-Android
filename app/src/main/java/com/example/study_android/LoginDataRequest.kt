package com.example.study_android

import com.google.gson.annotations.SerializedName

data class LoginDataRequest(
    val email : String,
    @SerializedName("pw") val password : String
)
