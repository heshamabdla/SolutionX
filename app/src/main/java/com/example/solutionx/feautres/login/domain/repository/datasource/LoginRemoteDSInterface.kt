package com.example.solutionx.feautres.login.domain.repository.datasource

import com.example.solutionx.feautres.login.data.dto.PersonDto

interface LoginRemoteDSInterface {

    suspend fun loginWithEmail(hashMap: HashMap<Any,Any>):PersonDto

//    suspend fun loginWithPhone(phone: String):PersonDto
//    suspend fun loginWithSocial(email: String):PersonDto

}