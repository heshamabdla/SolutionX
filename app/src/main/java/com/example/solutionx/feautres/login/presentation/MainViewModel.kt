package com.example.solutionx.feautres.login.presentation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope

import com.example.solutionx.feautres.login.domain.usecases.LoginWithPhoneUseCase
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
    private val loginWithPhone: LoginWithPhoneUseCase,
//    private val loginWithEmail: LoginWithEmailUseCase,
//    private val loginWithSocial: LoginWithSocialUseCase
):ViewModel() {
    private val _loginUser:MutableStateFlow<Any?> =MutableStateFlow(null)
    val loginUser: StateFlow<Any?> = _loginUser
    fun loginWithPhone(hashMap: HashMap<Any,Any>){
        viewModelScope.launch {
            try {
                _loginUser.value = loginWithPhone.invoke(hashMap)
            } catch (e: Exception) {

            }

        }
    }
}



//
//    init {
////       processIntent()
//
//        loginWithEmailAddress(s)
//    }
//
////    private fun processIntent(){
////        viewModelScope.launch {
////            intentPerson.collect {
////                when (it) {
////                    is PersonIntent.LoginEmail(loginWithEmail
////                        ) {
////                        loginWithEmailAddress(s)
////                    }
////
////                    is PersonIntent.LoginPhone(loginWithPhone
////                        ) {
////
////                    }
////
////                    is PersonIntent.LoginSocial(loginWithSocial
////                        ) {
////
////                    }
////
////                }
////            }
////        }
//
//
//    private fun loginWithEmailAddress(email: String) {
//        viewModelScope.launch {
//            loginWithEmail.invoke(email).collect() { r ->
//                when (r) {
//                    is Resource.Success -> {
//                        _loginState.value = PersonLoginState.Success(r.data)
//                    }
//
//                    is Resource.Failure -> {
//                        _loginState.value =  PersonLoginState.Error(r.message)
//                    }
//
//                    is Resource.Loading -> {
//                        _loginState.value = PersonLoginState.IsLoading(true)
//
//                    }
//                }
//
//            }
//
//        }
////        fun process(){
////            viewModelScope.launch {
////
////            }
//
//
//    }




