package com.example.solutionx.feautres.login.domain.usecases

import com.example.solutionx.feautres.login.data.dto.PersonDto
import com.example.solutionx.feautres.login.data.repository.Repository
import com.example.solutionx.feautres.login.domain.models.Person
import com.example.solutionx.feautres.login.presentation.MainViewModel

class LoginWithEmail(private val repository: Repository) {
    lateinit var mainViewModel: MainViewModel

//    fun loginWithEmail(){
//        repository.getPerson().email
//
//    }


    fun loginWithEmail():Person{
        return mainViewModel.sendDataToUseCase()
    }

    fun sendDataToRepo():Person{
            return Person(1,"Ali","aa@email",4546,"")
    }

}