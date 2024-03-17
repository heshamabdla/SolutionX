package com.example.solutionx.feautres.login.presentation.di

import com.example.solutionx.feautres.login.domain.repository.RepositoryInterface
import com.example.solutionx.feautres.login.domain.usecases.LoginWithEmailUseCase
import com.example.solutionx.feautres.login.domain.usecases.LoginWithPhoneUseCase
import com.example.solutionx.feautres.login.domain.usecases.LoginWithSocialUseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(ViewModelComponent::class)
object UseCaseModule {

    @Provides
    fun provideLoginWithEmail(repositoryInterface: RepositoryInterface):LoginWithEmailUseCase{
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