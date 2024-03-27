package com.example.solutionx.feautres.login.data.repository

import com.example.mysolutionx.features.login.domain.models.LoginResponse
import com.example.mysolutionx.features.login.domain.models.User
import com.example.solutionx.common.domain.Repository.local.ILoginLocalDS
import com.example.solutionx.feautres.login.data.mapper.MapperPersonDtoTLoginResponse.toLoginResponse
import com.example.solutionx.feautres.login.domain.repository.datasource.LoginLocalDSInterface
import com.example.solutionx.feautres.login.domain.repository.datasource.LoginRemoteDSInterface
import com.example.solutionx.feautres.login.domain.repository.RepositoryInterface

  class RepositoryImpl(
    private val loginRemoteDSInterface: LoginRemoteDSInterface,
    private val loginLocalDSInterface: ILoginLocalDS
) :RepositoryInterface{



    override suspend fun saveLogin(loginResponse: LoginResponse) {
        loginLocalDSInterface.saveLogin(loginResponse)
    }

    override suspend fun loginWithPhone(hashMap: HashMap<Any, Any>): LoginResponse {
      return  loginRemoteDSInterface.loginWithEmail(hashMap).toLoginResponse()
    }

    override suspend fun getAccessToken(): String {
       return loginLocalDSInterface.getAccessToken().toString()
    }

    override suspend fun getUser(): User {
        TODO("Not yet implemented")

//        return loginLocalDSInterface.getUser()
    }


}