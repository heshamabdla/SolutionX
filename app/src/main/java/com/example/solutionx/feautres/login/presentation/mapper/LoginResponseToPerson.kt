package com.example.solutionx.feautres.login.presentation.mapper

import com.example.solutionx.feautres.login.data.dto.PersonDto
import com.example.solutionx.feautres.login.domain.models.Person
import com.example.solutionx.feautres.login.presentation.models.LoginResponse

fun LoginResponse.toPerson(): Person {

    return Person(id=id,name=name,email=email, accessToken=accessToken)
}


fun Person.toLoginResponse(): LoginResponse {

    return LoginResponse(
        id, name, email, "", accessToken
    )
}