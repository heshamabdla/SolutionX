package com.example.solutionx.feautres.login.data.mapper

import com.example.solutionx.feautres.login.data.dto.PersonDto

internal object MapperPersonDtoToPerson {
    fun PersonDto.toPerson(): Person {

        return Person(
            id=id, name=name, email=email)
    }
    fun Person.toPersonDto(): PersonDto {
        return PersonDto(
            id=id, name=name, email=email,accessToken)

    }
}