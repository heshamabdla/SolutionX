package com.example.solutionx.feautres.login.data.datasource.romteDS

import com.example.solutionx.feautres.login.data.repository.Repository

class LoginRemoteDS: IloginRemoteDS {
    lateinit var repository: Repository

    override fun login() {
        repository.sendDataToDS()
    }
}