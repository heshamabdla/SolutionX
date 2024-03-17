package com.example.solutionx.feautres.login.domain.usecases

import com.example.solutionx.feautres.login.domain.models.Person
import com.example.solutionx.feautres.login.domain.repository.RemoteRepositoryInterface
import javax.inject.Inject

class LoginWithSocialUseCase @Inject constructor
    (private val remoteRepositoryInterface: RemoteRepositoryInterface) {
    suspend operator fun invoke(email: String):Person{
        return remoteRepositoryInterface.loginWithSocial(email)
    }

}