package com.example.solutionx.feautres.login.presentation

import com.example.solutionx.feautres.login.domain.usecases.LoginWithEmailUseCase
import com.example.solutionx.feautres.login.domain.usecases.LoginWithPhoneUseCase
import com.example.solutionx.feautres.login.domain.usecases.LoginWithSocialUseCase

sealed class PersonIntent ()
{
     data class LoginEmail( val loginWithEmailUseCase: LoginWithEmailUseCase):PersonIntent()
     data class LoginSocial( val loginWithSocialUseCase: LoginWithSocialUseCase):PersonIntent()
     data class LoginPhone( val loginWithPhoneUseCase: LoginWithPhoneUseCase):PersonIntent()
}

