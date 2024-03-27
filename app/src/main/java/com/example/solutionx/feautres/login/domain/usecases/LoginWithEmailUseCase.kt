package com.example.solutionx.feautres.login.domain.usecases


import com.example.solutionx.feautres.login.domain.repository.RepositoryInterface
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject
//
//class LoginWithEmailUseCase @Inject constructor
//    (private val repositoryInterface: RepositoryInterface) {
//
//       suspend operator fun invoke(email: String): Flow<Resource<Any>> =
//
//           flow {
//               try {
//
//                   val person = repositoryInterface.loginWithEmail(email)
//                   repositoryInterface.saveLogin(person.accessToken)
//                   emit(Resource.Loading<Person>(false))
//                   emit(Resource.Success(person))
//               }catch (e: Exception) {
//                   val failureResource = if (e is SolutionXException) e
//                   else SolutionXException.Unknown(message = "Unknown error in GetCountriesUC: $e")
//
//                   emit(Resource.Failure(failureResource))
//                   emit(Resource.Loading<Person>(false))
//               }
//           }
//        }
