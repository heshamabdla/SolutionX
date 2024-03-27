package com.example.solutionx.feautres.login.data.repository.datasource.romteDS

import com.example.mysolutionx.common.data.Repository.remote.ApiService
import com.example.mysolutionx.features.login.domain.models.LoginResponse
import com.example.solutionx.feautres.login.data.dto.PersonDto
import com.example.solutionx.feautres.login.domain.repository.datasource.LoginRemoteDSInterface

  class LoginRemoteDS (private val apiService: ApiService): LoginRemoteDSInterface {
     override suspend fun loginWithEmail(hashMap: HashMap<Any, Any>): PersonDto {
         return apiService.loginWithPhone(hashMap)
     }


     //    override suspend fun loginWithSocial(email: String): PersonDto {
//        TODO("Not yet implemented")
//    }
//
//    override suspend fun loginWithEmail(email: String): PersonDto {
////        TODO("Not yet implemented")
////    }


 }