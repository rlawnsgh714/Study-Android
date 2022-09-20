package com.example.study_android

import java.time.LocalDate

data class LoginDataResponse(
    val token : String,
    val refreshToken : String,
    val member : MemberResponse,
)

data class MemberResponse(
    val id : Int,
    val email : String,
    val profileImage : String,
    val joinedAt : LocalDate,
)
