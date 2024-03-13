package com.example.solutionx.feautres.login.domain.models

import com.example.solutionx.feautres.login.data.dto.PersonDto
import com.example.solutionx.feautres.login.data.mapper.toPerson

data class Person(
    val id:Int,
    val name:String,
    val email:String,
    val phone:Int=44,
    val accessToken:String=""

    )
fun f(personDto: PersonDto): Person {
    return personDto.toPerson()
}
