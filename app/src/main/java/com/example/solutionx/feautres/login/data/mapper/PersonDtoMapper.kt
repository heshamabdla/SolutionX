package com.example.solutionx.feautres.login.data.mapper

import com.example.solutionx.feautres.login.data.dto.PersonDto
import com.example.solutionx.feautres.login.domain.models.Person

fun PersonDto.toPerson(): Person {

    return Person(
        id=id, name=name, email=email,phone=phone)

}


fun Person.toPersonDto(): PersonDto {

    return PersonDto(
        id=id, name=name, email=email,phone=phone
    )
}
