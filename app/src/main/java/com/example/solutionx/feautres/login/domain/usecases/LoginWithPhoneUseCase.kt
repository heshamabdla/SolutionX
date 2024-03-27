package com.example.solutionx.feautres.login.domain.usecases

import Resource
import com.example.solutionx.common.exception.SolutionXException
import com.example.mysolutionx.features.login.domain.models.LoginResponse

import com.example.solutionx.feautres.login.domain.repository.RepositoryInterface
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class LoginWithPhoneUseCase @Inject constructor
    (private val repositoryInterface: RepositoryInterface) {

    suspend operator fun invoke(hashMap: HashMap<Any,Any>): Flow<Resource<LoginResponse>> =

        flow {
            try {
                repositoryInterface.saveLogin(repositoryInterface.loginWithPhone(hashMap))
                emit(Resource.loading(false))
                emit(Resource.Success(repositoryInterface.loginWithPhone(hashMap)))
            }catch (e: Exception) {
                val failureResource = if (e is SolutionXException) e
                else SolutionXException.Unknown(message = "Unknown error in GetCountriesUC: $e")

                emit(Resource.Failure(failureResource))
                emit(Resource.loading(false))
            }
        }
}
