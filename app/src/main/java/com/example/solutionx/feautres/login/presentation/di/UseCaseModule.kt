package com.example.solutionx.feautres.login.presentation.di

import com.example.solutionx.feautres.login.domain.usecases.LoginWithEmailUseCase
import com.example.solutionx.feautres.login.domain.usecases.LoginWithPhoneUseCase
import com.example.solutionx.feautres.login.domain.usecases.LoginWithSocialUseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object UseCaseModule {

    @Provides
    fun provideLoginWithEmail(remoteRepositoryInterface: RemoteRepositoryInterface):LoginWithEmailUseCase{
        return LoginWithEmailUseCase(remoteRepositoryInterface)

    }
    @Provides
    fun provideLoginWithPhone(remoteRepositoryInterface: RemoteRepositoryInterface): LoginWithPhoneUseCase {
        return LoginWithPhoneUseCase(remoteRepositoryInterface)

    }
    @Provides
    fun provideLoginWithSocial(remoteRepositoryInterface: RemoteRepositoryInterface): LoginWithSocialUseCase {
        return LoginWithSocialUseCase(remoteRepositoryInterface)

    }
}