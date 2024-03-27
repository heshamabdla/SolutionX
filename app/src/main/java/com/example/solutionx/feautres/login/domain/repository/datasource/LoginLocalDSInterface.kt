package com.example.solutionx.feautres.login.domain.repository.datasource

import com.example.mysolutionx.features.login.domain.models.LoginResponse

interface LoginLocalDSInterface {
    suspend fun saveLogin(loginResponse: LoginResponse)


}