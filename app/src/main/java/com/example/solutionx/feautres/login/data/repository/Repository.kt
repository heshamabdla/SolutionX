package com.example.solutionx.feautres.login.data.repository

import com.example.solutionx.feautres.login.data.dto.PersonDto
import com.example.solutionx.feautres.login.data.mapper.toPerson
import com.example.solutionx.feautres.login.data.mapper.toPersonDto
import com.example.solutionx.feautres.login.data.datasource.service.PersonServiceDto
import com.example.solutionx.feautres.login.domain.models.Person
import com.example.solutionx.feautres.login.domain.usecases.LoginWithEmail
import com.example.solutionx.feautres.login.domain.usecases.LoginWithPhone
import com.example.solutionx.feautres.login.domain.usecases.LoginWithSocial

class Repository(

      private val personServiceDto: PersonServiceDto
) {
    lateinit var loginWithEmail: LoginWithEmail
    lateinit var loginWithPhone: LoginWithPhone
    lateinit var loginWithSocial: LoginWithSocial

    fun getPerson(): Person {
        return personServiceDto.getPersonDto().toPerson()
    }

    fun insertPerson(person: Person){
        sendDataToDS()
        personServiceDto.insertPersonDto(person.toPersonDto())
    }

    fun sendDataToDS():PersonDto{
        return loginWithEmail.sendDataToRepo().toPersonDto()
//        return loginWithPhone.sendDataToRepo().toPersonDto()
//        return loginWithSocial.sendDataToRepo().toPersonDto()
    }


}