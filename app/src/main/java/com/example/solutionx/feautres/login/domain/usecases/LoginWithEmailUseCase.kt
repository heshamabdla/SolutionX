package com.example.solutionx.feautres.login.domain.usecases

import com.example.solutionx.feautres.login.domain.models.Person
import com.example.solutionx.feautres.login.domain.repository.RepositoryInterface
import javax.inject.Inject

class LoginWithEmailUseCase @Inject constructor
    (private val repositoryInterface: RepositoryInterface) {

       suspend operator fun invoke(email: String):Person{
//           repositoryInterface.saveLogin(person)
             return repositoryInterface.loginWithEmail(email)
        }
}