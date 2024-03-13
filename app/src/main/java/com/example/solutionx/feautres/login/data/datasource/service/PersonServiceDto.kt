package com.example.solutionx.feautres.login.data.datasource.service

import com.example.solutionx.feautres.login.data.dto.PersonDto

class PersonServiceDto {
    fun getPersonDto(): PersonDto {
        return PersonDto(1,"Ahmed","a",11111)
    }
    fun insertPersonDto(personDto: PersonDto){

    }
}