package com.example.solutionx.feautres.login.di

import android.content.Context
import com.example.mysolutionx.common.data.Repository.local.LocalDSImp
import com.example.mysolutionx.common.data.Repository.remote.ApiService
import com.example.solutionx.common.domain.Repository.local.ILoginLocalDS
import com.example.solutionx.common.domain.Repository.remote.ILoginRemoteInterface
import com.example.solutionx.feautres.login.domain.repository.datasource.LoginLocalDSInterface
import com.example.solutionx.feautres.login.domain.repository.datasource.LoginRemoteDSInterface
import com.example.solutionx.feautres.login.data.repository.RepositoryImpl
import com.example.solutionx.feautres.login.data.repository.datasource.romteDS.LoginRemoteDS
import com.example.solutionx.feautres.login.domain.repository.RepositoryInterface
import com.example.solutionx.feautres.login.domain.usecases.LoginWithPhoneUseCase
import com.google.gson.Gson
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object
loginDI {


    @Provides
    fun provideRemoteDS(apiService: ApiService): LoginRemoteDS = LoginRemoteDS(apiService)

    @Provides
    fun provideLocalDS(@ApplicationContext context: Context,gson: Gson): ILoginLocalDS =
          LocalDSImp( context,gson)
    }
   @Provides
   fun provideRepository(loginRemoteDSInterface: LoginRemoteDSInterface,loginLocalDSInterface:
   ILoginLocalDS): RepositoryInterface =RepositoryImpl(loginRemoteDSInterface, loginLocalDSInterface)



    @Provides
    fun provideLoginWithPhoneUC(repository: RepositoryInterface,): LoginWithPhoneUseCase =
        LoginWithPhoneUseCase(repository)
    @Provides
    @Singleton
    fun provideContext(@ApplicationContext context: Context): Context = context



