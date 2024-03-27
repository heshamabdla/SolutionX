package com.example.mysolutionx.common.domain.Repository.remote

import com.example.mysolutionx.features.login.domain.models.LoginResponse
import com.example.solutionx.feautres.login.data.dto.PersonDto

interface ILoginRemoteInterface {
    suspend fun loginWithPhone(hashMap: HashMap<Any,Any>):PersonDto
}