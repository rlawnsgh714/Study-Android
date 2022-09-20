package com.example.study_android

import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.POST

interface LoginService {

    @POST("member/login")
    fun login(
        @Body loginDataRequest: LoginDataRequest
    ) : Call<DataResponse<LoginDataResponse>>
}