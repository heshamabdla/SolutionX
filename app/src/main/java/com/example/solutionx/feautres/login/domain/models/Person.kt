package com.example.solutionx.feautres.login.domain.models

import com.example.solutionx.feautres.login.data.dto.PersonDto

data class Person(
    val id:Int,
    val name:String,
    val email:String,
    val accessToken:String=""

    )
