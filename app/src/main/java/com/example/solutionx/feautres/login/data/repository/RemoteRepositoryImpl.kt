package com.example.solutionx.feautres.login.data.repository

import com.example.solutionx.feautres.login.data.datasource.romteDS.LoginRemoteDSInterface
import com.example.solutionx.feautres.login.data.mapper.MapperPersonDtoToPerson.toPerson
import com.example.solutionx.feautres.login.domain.models.Person
import com.example.solutionx.feautres.login.domain.repository.RemoteRepositoryInterface

class RemoteRepositoryImpl(
   private val loginRemoteDSInterface: LoginRemoteDSInterface
) :RemoteRepositoryInterface{

    override suspend fun loginWithEmail(email: String): Person {
        return loginRemoteDSInterface.loginWithEmail(email).toPerson()
    }

    override suspend fun loginWithPhone(phone: String): Person {
        return loginRemoteDSInterface.loginWithPhone(phone).toPerson()
    }

    override suspend fun loginWithSocial(email: String): Person {
        return loginRemoteDSInterface.loginWithSocial(email).toPerson()
    }
}