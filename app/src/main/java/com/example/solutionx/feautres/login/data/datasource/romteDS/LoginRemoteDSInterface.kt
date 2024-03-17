package com.example.solutionx.feautres.login.data.datasource.romteDS

import com.example.solutionx.feautres.login.data.dto.PersonDto

interface LoginRemoteDSInterface {
    suspend fun loginWithEmail(email:String):PersonDto
    suspend fun loginWithPhone(phone: String):PersonDto
    suspend fun loginWithSocial(email: String):PersonDto

}