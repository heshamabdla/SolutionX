package com.example.solutionx.feautres.login.presentation

import com.example.solutionx.feautres.login.domain.models.Person
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.solutionx.feautres.login.domain.usecases.LoginWithEmailUseCase
import com.example.solutionx.feautres.login.domain.usecases.LoginWithPhoneUseCase
import com.example.solutionx.feautres.login.domain.usecases.LoginWithSocialUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainViewModel
   @Inject constructor (
    private val loginWithEmail: LoginWithEmailUseCase,
    private val loginWithPhone: LoginWithPhoneUseCase,
    private val loginWithSocial: LoginWithSocialUseCase
):ViewModel() {

        private val _dataLogin:MutableStateFlow<Person?> =MutableStateFlow(null)
        val dataLogin:StateFlow<Person?> =_dataLogin


        fun loginWithEmail(email: String){
            viewModelScope.launch {
                _dataLogin.value = loginWithEmail.invoke(email)
            }
        }

        fun loginWithPhone(phone: String) {
            viewModelScope.launch {
                _dataLogin.value = loginWithPhone.invoke(phone)
            }
        }

        fun loginWithSocial(email: String){
            viewModelScope.launch {
                _dataLogin.value = loginWithSocial.invoke(email)
            }
        }




}


