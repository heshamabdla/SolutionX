package com.example.solutionx.feautres.login.data.datasource.localDS

import com.example.solutionx.feautres.login.data.datasource.romteDS.LoginRemoteDSInterface


class LoginLocalDS
    (private val loginLocalDSInterface: LoginLocalDSInterface)
    : LoginLocalDSInterface  {
    override suspend fun saveLogin(accessToken: String) {


    }



}