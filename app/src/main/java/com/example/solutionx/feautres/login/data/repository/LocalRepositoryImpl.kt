package com.example.solutionx.feautres.login.data.repository

import com.example.solutionx.feautres.login.data.datasource.localDS.LoginLocalDSInterface
import com.example.solutionx.feautres.login.data.datasource.romteDS.LoginRemoteDSInterface
import com.example.solutionx.feautres.login.data.mapper.MapperPersonDtoToPerson.toPerson
import com.example.solutionx.feautres.login.data.mapper.MapperPersonDtoToPerson.toPersonDto
import com.example.solutionx.feautres.login.domain.models.Person
import com.example.solutionx.feautres.login.domain.repository.LocalRepositoryInterface


class LocalRepositoryImpl(
       private val loginLocalDSInterface: LoginLocalDSInterface
) :LocalRepositoryInterface{
    override suspend fun saveLogin(person: Person) {
        loginLocalDSInterface.saveLogin(person.toPersonDto().accessToken)
    }


}