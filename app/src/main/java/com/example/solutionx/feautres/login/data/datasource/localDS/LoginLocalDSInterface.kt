package com.example.solutionx.feautres.login.data.datasource.localDS

interface LoginLocalDSInterface {
    suspend fun saveLogin(accessToken:String)
}