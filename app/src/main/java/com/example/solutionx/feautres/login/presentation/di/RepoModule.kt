package com.example.solutionx.feautres.login.presentation.di

import com.example.solutionx.feautres.login.data.datasource.localDS.LoginLocalDS
import com.example.solutionx.feautres.login.data.datasource.localDS.LoginLocalDSInterface
import com.example.solutionx.feautres.login.data.datasource.romteDS.LoginRemoteDS
import com.example.solutionx.feautres.login.data.datasource.romteDS.LoginRemoteDSInterface
import com.example.solutionx.feautres.login.data.repository.RepositoryImpl
import com.example.solutionx.feautres.login.domain.repository.RepositoryInterface
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object RepoModule {

    @Provides
    fun provideRemoteRepo(loginRemoteDSInterface: LoginRemoteDSInterface):LoginRemoteDSInterface{
        return LoginRemoteDS(loginRemoteDSInterface)
    }

    @Provides
    fun provideLocalRepo(loginLocalDSInterface: LoginLocalDSInterface):LoginLocalDSInterface{
        return LoginLocalDS(loginLocalDSInterface)



        @Provides
        fun provideRepo(loginRemoteDSInterface: LoginRemoteDSInterface,
                        loginLocalDSInterface: LoginLocalDSInterface):RepositoryInterface{
            return RepositoryImpl(loginRemoteDSInterface,loginLocalDSInterface)
        }
//
//        @Provides
//        fun provideLocalRepo(loginLocalDSInterface: LoginLocalDSInterface):LocalRepositoryInterface{
//            return LocalRepositoryImpl(loginLocalDSInterface)
//        }

    }

}