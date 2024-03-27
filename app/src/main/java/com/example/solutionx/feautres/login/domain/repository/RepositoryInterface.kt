package com.example.solutionx.feautres.login.domain.repository

import com.example.mysolutionx.features.login.domain.models.LoginResponse
import com.example.mysolutionx.features.login.domain.models.User
import com.example.solutionx.feautres.login.domain.models.Person

interface RepositoryInterface {



        suspend fun saveLogin(loginResponse: LoginResponse)

        suspend fun loginWithPhone(phone: String): LoginResponse

        suspend fun getAccessToken():String
        suspend fun getUser(): User


//        suspend fun loginWithSocial(email: String): Person
//        suspend fun loginWithEmail(email:String): Person

}