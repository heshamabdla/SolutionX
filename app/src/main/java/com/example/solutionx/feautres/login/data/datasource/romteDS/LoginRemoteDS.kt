package com.example.solutionx.feautres.login.data.datasource.romteDS

import com.example.solutionx.feautres.login.data.dto.PersonDto

class LoginRemoteDS(private val iloginRemoteDS: LoginRemoteDSInterface): LoginRemoteDSInterface {
    override suspend fun loginWithEmail(email: String): PersonDto {
        TODO("Not yet implemented")
    }

    override suspend fun loginWithPhone(phone: String): PersonDto {
        TODO("Not yet implemented")
    }

    override suspend fun loginWithSocial(email: String): PersonDto {
        TODO("Not yet implemented")
    }


}