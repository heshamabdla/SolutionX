package com.example.solutionx.feautres.login.domain.repository

import com.example.solutionx.feautres.login.domain.models.Person

interface LocalRepositoryInterface {

        suspend fun saveLogin(person:Person)

}