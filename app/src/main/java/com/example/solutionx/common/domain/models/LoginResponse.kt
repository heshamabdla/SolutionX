package com.example.mysolutionx.features.login.domain.models

data class LoginResponse(
    val message: String,
    val token: String,
    val user: User?
)