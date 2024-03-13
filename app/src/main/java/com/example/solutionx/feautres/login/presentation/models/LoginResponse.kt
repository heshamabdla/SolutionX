package com.example.solutionx.feautres.login.presentation.models

import com.example.solutionx.feautres.login.domain.models.Person
import com.example.solutionx.feautres.login.domain.usecases.LoginWithEmail

data class LoginResponse(
    val id:Int,
    val name:String,
    val email: String,
    val dateOfBirth:String ="",
    val accessToken:String=""
)
