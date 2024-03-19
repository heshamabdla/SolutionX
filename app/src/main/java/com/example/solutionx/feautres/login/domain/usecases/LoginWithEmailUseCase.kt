package com.example.solutionx.feautres.login.domain.usecases

import com.example.solutionx.feautres.login.common.Resource
import com.example.solutionx.feautres.login.common.SolutionXException
import com.example.solutionx.feautres.login.domain.models.Person
import com.example.solutionx.feautres.login.domain.repository.RepositoryInterface
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class LoginWithEmailUseCase @Inject constructor
    (private val repositoryInterface: RepositoryInterface) {

       suspend operator fun invoke(email: String): Flow<Resource<Person> > =

           flow {
               try {

                   emit(Resource.Loading<Person>(true))
                   val person = repositoryInterface.loginWithEmail(email)
                   repositoryInterface.saveLogin(person.accessToken)
                   emit(Resource.Success<Person>(person))
               }catch (e : SolutionXException){

                   emit(Resource.Failure<Person>(SolutionXException(e.findExceptionType())))
                   }
           }
        }
