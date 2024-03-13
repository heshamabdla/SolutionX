package com.example.solutionx.feautres.login.presentation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.solutionx.feautres.login.domain.models.Person
import com.example.solutionx.feautres.login.domain.usecases.LoginWithEmail
import com.example.solutionx.feautres.login.domain.usecases.LoginWithPhone
import com.example.solutionx.feautres.login.domain.usecases.LoginWithSocial
import com.example.solutionx.feautres.login.presentation.mapper.toLoginResponse
import com.example.solutionx.feautres.login.presentation.mapper.toPerson
import com.example.solutionx.feautres.login.presentation.models.LoginResponse
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

class MainViewModel
    (
)
    :ViewModel() {

        private val _dataLogin:MutableStateFlow<LoginResponse?> =MutableStateFlow(null)
        val dataLogin:StateFlow<LoginResponse?> =_dataLogin

       private lateinit var loginWithEmail: LoginWithEmail
        private lateinit var loginWithPhone: LoginWithPhone
       private lateinit var loginWithSocial: LoginWithSocial


//    init {
//        initPerson()
//    }
//
//    private fun initPerson(){
//                _dataLogin.value=loginWithEmail.loginWithEmail()
//
//      }

       // loginResponse sent from View
    private val person=LoginResponse(1,"ahmed","a@gmail.com"
        ,"","").toPerson()


    fun sendDataToUseCase():Person{
        return person
    }

    fun getPerson(){
        loginWithEmail.sendDataToRepo().toLoginResponse()
    }








//    fun loginWithPhoneNumberloginResponse: LoginResponse){
//        //
//        loginResponse.toPerson()
//
//
//    }
//    fun loginWithSocialMedia(accessToken:String){
//        //
//
//    }




}


