package com.example.mysolutionx.common.data.Repository.remote

import com.example.mysolutionx.features.login.domain.models.LoginResponse
import com.example.solutionx.feautres.login.data.dto.PersonDto
import retrofit2.http.Body
import retrofit2.http.POST

interface ApiService {
    @POST("login")
   suspend fun loginWithPhone(@Body hashMap: HashMap<Any,Any>): PersonDto
}