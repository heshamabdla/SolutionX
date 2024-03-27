package com.example.solutionx.common.domain.Repository.local

import com.example.mysolutionx.features.login.domain.models.LoginResponse
import com.example.mysolutionx.features.login.domain.models.User
import kotlinx.coroutines.flow.Flow

 interface ILoginLocalDS {
    suspend fun saveLogin(loginResponse: LoginResponse)

    suspend fun getAccessToken():Flow<String?>
    suspend fun getUser(): Flow<User?>
}