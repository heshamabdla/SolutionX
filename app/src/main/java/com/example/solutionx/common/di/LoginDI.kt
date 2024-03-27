package com.example.mysolutionx.features.login.di

import com.example.mysolutionx.common.data.Repository.remote.ApiService
import com.example.solutionx.feautres.login.data.repository.RepositoryImpl
import com.example.solutionx.feautres.login.domain.repository.RepositoryInterface
import com.example.solutionx.common.domain.Repository.local.ILoginLocalDS
import com.example.solutionx.feautres.login.domain.repository.datasource.LoginRemoteDSInterface
import com.example.solutionx.feautres.login.domain.usecases.LoginWithPhoneUseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent

@Module
@InstallIn(ViewModelComponent::class)
internal object LoginDI {




    }
