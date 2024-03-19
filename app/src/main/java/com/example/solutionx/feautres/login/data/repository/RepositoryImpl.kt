package com.example.solutionx.feautres.login.data.repository

import com.example.solutionx.feautres.login.data.datasource.localDS.LoginLocalDSInterface
import com.example.solutionx.feautres.login.data.datasource.romteDS.LoginRemoteDSInterface
import com.example.solutionx.feautres.login.data.mapper.MapperPersonDtoToPerson.toPerson
import com.example.solutionx.feautres.login.data.mapper.MapperPersonDtoToPerson.toPersonDto
import com.example.solutionx.feautres.login.domain.models.Person
import com.example.solutionx.feautres.login.domain.repository.RepositoryInterface
import java.security.PrivateKey

class RepositoryImpl(
   private val loginRemoteDSInterface: LoginRemoteDSInterface,
    private val loginLocalDSInterface: LoginLocalDSInterface
) :RepositoryInterface{


    override suspend fun loginWithEmail(email: String): Person {
        return loginRemoteDSInterface.loginWithEmail(email).toPerson()
    }

    override suspend fun loginWithPhone(phone: String): Person {
        return loginRemoteDSInterface.loginWithPhone(phone).toPerson()
    }

    override suspend fun loginWithSocial(email: String): Person {
        return loginRemoteDSInterface.loginWithSocial(email).toPerson()
    }

    override suspend fun saveLogin(accessToken: String) {
        loginLocalDSInterface.saveLogin(accessToken)
    }
}