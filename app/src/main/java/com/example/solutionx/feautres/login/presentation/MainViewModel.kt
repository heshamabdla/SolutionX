package com.example.solutionx.feautres.login.presentation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope

import com.example.solutionx.feautres.login.common.Resource
import com.example.solutionx.feautres.login.domain.usecases.LoginWithEmailUseCase
import com.example.solutionx.feautres.login.domain.usecases.LoginWithPhoneUseCase
import com.example.solutionx.feautres.login.domain.usecases.LoginWithSocialUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.flow.consumeAsFlow
import kotlinx.coroutines.flow.onEach
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainViewModel
   @Inject constructor (
    private val loginWithEmail: LoginWithEmailUseCase,
    private val loginWithPhone: LoginWithPhoneUseCase,
    private val loginWithSocial: LoginWithSocialUseCase
):ViewModel() {

    val intentPerson = Channel<PersonIntent> (Channel.UNLIMITED)

    private val _loginState: MutableStateFlow<PersonLoginState?> = MutableStateFlow(null)
    val loginState: StateFlow<PersonLoginState?> = _loginState

    lateinit var s: String

    init {
//       processIntent()

        loginWithEmailAddress(s)
    }

//    private fun processIntent(){
//        viewModelScope.launch {
//            intentPerson.collect {
//                when (it) {
//                    is PersonIntent.LoginEmail(loginWithEmail
//                        ) {
//                        loginWithEmailAddress(s)
//                    }
//
//                    is PersonIntent.LoginPhone(loginWithPhone
//                        ) {
//
//                    }
//
//                    is PersonIntent.LoginSocial(loginWithSocial
//                        ) {
//
//                    }
//
//                }
//            }
//        }


    private fun loginWithEmailAddress(email: String) {
        viewModelScope.launch {
            loginWithEmail.invoke(email).collect() { r ->
                when (r) {
                    is Resource.Success -> {
                        _loginState.value = PersonLoginState.Success(r.data)
                    }

                    is Resource.Failure -> {
                        _loginState.value =  PersonLoginState.Error(r.message)
                    }

                    is Resource.Loading -> {
                        _loginState.value = PersonLoginState.IsLoading(true)

                    }
                }

            }

        }
//        fun process(){
//            viewModelScope.launch {
//
//            }


    }
}



