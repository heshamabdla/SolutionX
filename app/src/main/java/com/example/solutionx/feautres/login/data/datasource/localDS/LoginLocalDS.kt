package com.example.solutionx.feautres.login.data.datasource.localDS

import com.example.solutionx.feautres.login.data.repository.Repository


class LoginLocalDS : IloginLocalDS  {
    lateinit var repository: Repository
    override fun saveLogin(accessToken: String) {
        repository.sendDataToDS()
    }



}