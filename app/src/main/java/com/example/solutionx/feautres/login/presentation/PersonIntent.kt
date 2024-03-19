package com.example.solutionx.feautres.login.presentation

import com.example.solutionx.feautres.login.domain.usecases.LoginWithEmailUseCase
import com.example.solutionx.feautres.login.domain.usecases.LoginWithPhoneUseCase
import com.example.solutionx.feautres.login.domain.usecases.LoginWithSocialUseCase

sealed class PersonIntent (
     val loginWithSocialUseCase: LoginWithSocialUseCase,
     val loginWithEmailUseCase: LoginWithEmailUseCase,
     val loginWithPhoneUseCase: LoginWithPhoneUseCase
)

