package com.example.solutionx.feautres.login.domain.usecases

import com.example.solutionx.feautres.login.domain.models.Person
import javax.inject.Inject

class LoginWithEmailUseCase @Inject constructor
    (private val remoteRepositoryInterface: RemoteRepositoryInterface) {

       suspend operator fun invoke(email: String):Person{
             return remoteRepositoryInterface.loginWithEmail(email)
        }
}