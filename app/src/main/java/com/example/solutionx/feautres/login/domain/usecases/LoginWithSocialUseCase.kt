package com.example.solutionx.feautres.login.domain.usecases

import com.example.solutionx.feautres.login.data.mapper.MapperPersonDtoToPerson.toPersonDto
import com.example.solutionx.feautres.login.domain.models.Person
import com.example.solutionx.feautres.login.domain.repository.RepositoryInterface
import javax.inject.Inject

class LoginWithSocialUseCase @Inject constructor
    (private val repositoryInterface: RepositoryInterface) {
    suspend operator fun invoke(email: String):Person{
//        val person=repositoryInterface.loginWithSocial(email)

//        repositoryInterface.saveLogin(person.toPersonDto().accessToken)
        return  repositoryInterface.loginWithSocial(email)
    }

}