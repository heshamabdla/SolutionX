package com.example.solutionx.feautres.login.presentation

import com.example.solutionx.feautres.login.domain.models.Person


data class PersonLoginState(
    val isLoading: Boolean? = false,
    val person:Person? =null,
    val error: String? = ""
)
