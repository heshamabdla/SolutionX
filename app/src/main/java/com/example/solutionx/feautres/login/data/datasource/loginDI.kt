package com.example.solutionx.feautres.login.data.datasource

import com.example.solutionx.feautres.login.data.datasource.localDS.LoginLocalDS
import com.example.solutionx.feautres.login.data.datasource.romteDS.LoginRemoteDS


object loginDI {

    fun provideLoginRemoteDS(): LoginRemoteDS = LoginRemoteDS()
    fun provideLoginLocalDS(): LoginLocalDS = LoginLocalDS()

}