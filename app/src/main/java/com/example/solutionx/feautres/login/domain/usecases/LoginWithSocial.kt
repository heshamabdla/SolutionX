package com.example.solutionx.feautres.login.domain.usecases

import com.example.solutionx.feautres.login.data.repository.Repository
import com.example.solutionx.feautres.login.domain.models.Person
import com.example.solutionx.feautres.login.presentation.MainViewModel

class LoginWithSocial(private val repository: Repository) {
    lateinit var mainViewModel: MainViewModel

    fun loginWithSocial():Person{

        return mainViewModel.sendDataToUseCase()
    }
    fun sendDataToRepo(): Person {
        return Person(1,"Ali","aa@email",4546,"")
    }
}