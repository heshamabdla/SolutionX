package com.example.solutionx.feautres.login.di

import com.example.solutionx.feautres.login.domain.repository.datasource.LoginLocalDSInterface
import com.example.solutionx.feautres.login.domain.repository.datasource.LoginRemoteDSInterface
import com.example.solutionx.feautres.login.data.repository.RepositoryImpl
import com.example.solutionx.feautres.login.domain.repository.RepositoryInterface
import com.example.solutionx.feautres.login.domain.usecases.LoginWithEmailUseCase
import com.example.solutionx.feautres.login.domain.usecases.LoginWithPhoneUseCase
import com.example.solutionx.feautres.login.domain.usecases.LoginWithSocialUseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object
loginDI {

    @Provides
    fun provideRemoteRepo(): LoginRemoteDSInterface {
        return LoginRemoteDS()
    }

    @Provides
    fun provideLocalRepo(): LoginLocalDSInterface {
        return LoginLocalDS()



        @Provides
        fun provideRepo(
            loginRemoteDSInterface: LoginRemoteDSInterface,
            loginLocalDSInterface: LoginLocalDSInterface
        ): RepositoryInterface {
            return RepositoryImpl(loginRemoteDSInterface, loginLocalDSInterface)
        }


        @Provides
        fun provideLoginWithEmail(repositoryInterface: RepositoryInterface): LoginWithEmailUseCase {
            return LoginWithEmailUseCase(repositoryInterface)

        }

        @Provides
        fun provideLoginWithPhone(repositoryInterface: RepositoryInterface): LoginWithPhoneUseCase {
            return LoginWithPhoneUseCase(repositoryInterface)

        }

        @Provides
        fun provideLoginWithSocial(repositoryInterface: RepositoryInterface): LoginWithSocialUseCase {
            return LoginWithSocialUseCase(repositoryInterface)

        }


    }
}