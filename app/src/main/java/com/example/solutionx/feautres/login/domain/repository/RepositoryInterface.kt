package com.example.solutionx.feautres.login.domain.repository

import com.example.solutionx.feautres.login.domain.models.Person

interface RepositoryInterface {

        suspend fun saveLogin(accessToken: String)

        suspend fun loginWithEmail(email:String): Person
        suspend fun loginWithPhone(phone: String): Person
        suspend fun loginWithSocial(email: String): Person

}